package ma.fstt.aideservice.Controllers;

import ma.fstt.aideservice.Entities.Volontariat;
import ma.fstt.aideservice.Services.VolontariatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/aide/volontariat")
@RestController
public class VolontariatCtl {
    @Autowired
    VolontariatService VolontariatService;

    @GetMapping
    public List<Volontariat> getall() {
        return VolontariatService.getall();
    }

    @GetMapping("/{id}")
    public Volontariat getone(@PathVariable Long id) {
        return VolontariatService.getone(id);
    }

    @PostMapping
    public Volontariat save(@RequestBody Volontariat aide) {
        return VolontariatService.save(aide);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        VolontariatService.delete(id);
    }

    @PatchMapping("/{id}")
    public Volontariat update(@PathVariable Long id, @RequestBody Volontariat aide) {
        aide.setAide_id(id);
        return VolontariatService.update(aide);
    }

    @GetMapping("/catastrophe/{id}")
    public List<Volontariat> findByCatastrophe_id(@PathVariable Long id) {
        return VolontariatService.findByCatastrophe_id(id);
    }

}
