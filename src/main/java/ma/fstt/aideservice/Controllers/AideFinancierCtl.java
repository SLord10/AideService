package ma.fstt.aideservice.Controllers;

import ma.fstt.aideservice.Entities.AideFinancier;
import ma.fstt.aideservice.Services.AideFinancierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/aide/aide-financier")
@RestController
public class AideFinancierCtl {
    @Autowired
    AideFinancierService AideFinancierService;

    @GetMapping
    public List<AideFinancier> getall() {
        return AideFinancierService.getall();
    }
    @GetMapping("/{id}")
    public AideFinancier getone(@PathVariable Long id) {
        return AideFinancierService.getone(id);
    }
    @PostMapping
    public AideFinancier save(@RequestBody AideFinancier aide) {
        return AideFinancierService.save(aide);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        AideFinancierService.delete(id);
    }
    @PatchMapping("/{id}")
    public AideFinancier update(@PathVariable Long id, @RequestBody AideFinancier aide) {
        aide.setAide_id(id);
        return AideFinancierService.update(aide);
    }

    @GetMapping("/catastrophe/{id}")
    public List<AideFinancier> findByCatastrophe_id(@PathVariable Long id) {
        return AideFinancierService.findByCatastrophe_id(id);
    }

}
