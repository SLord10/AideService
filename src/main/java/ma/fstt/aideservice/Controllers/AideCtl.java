package ma.fstt.aideservice.Controllers;

import ma.fstt.aideservice.Entities.Aide;
import ma.fstt.aideservice.Services.AideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/aide")
@RestController
public class AideCtl {

    @Autowired
    AideService aideService;

    @GetMapping
    public List<Aide> getall() {
        return aideService.getall();
    }

    @GetMapping("/{id}")
    public Aide getone(@PathVariable Long id) {
        return aideService.getone(id);
    }
    @PostMapping
    public Aide save(@RequestBody Aide aide) {
        return aideService.save(aide);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        aideService.delete(id);
    }
    @PatchMapping("/{id}")
    public Aide update(@PathVariable Long id, @RequestBody Aide aide) {
        aide.setAide_id(id);
        return aideService.update(aide);
    }

    @GetMapping("/catastrophe/{id}")
    public List<Aide> findByCatastrophe_id(@PathVariable Long id) {
        return aideService.findByCatastrophe_id(id);
    }

}
