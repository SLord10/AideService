package ma.fstt.aideservice.Controllers;

import ma.fstt.aideservice.Entities.AideLogistique;
import ma.fstt.aideservice.Services.AideLogistiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/aide/aide-logistique")
@RestController
public class AideLogistiqueCtl {
    @Autowired
    AideLogistiqueService AideLogistiqueService;

    @GetMapping
    public List<AideLogistique> getall() {
        return AideLogistiqueService.getall();
    }
    @GetMapping("/{id}")
    public AideLogistique getone(@PathVariable Long id) {
        return AideLogistiqueService.getone(id);
    }
    @PostMapping
    public AideLogistique save(@RequestBody AideLogistique aide) {
        return AideLogistiqueService.save(aide);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        AideLogistiqueService.delete(id);
    }
    @PatchMapping("/{id}")
    public AideLogistique update(@PathVariable Long id, @RequestBody AideLogistique aide) {
        aide.setAide_id(id);
        return AideLogistiqueService.update(aide);
    }
    @GetMapping("/catastrophe/{id}")
    public List<AideLogistique> findByCatastrophe_id(@PathVariable Long id) {
        return AideLogistiqueService.findByCatastrophe_id(id);
    }

}
