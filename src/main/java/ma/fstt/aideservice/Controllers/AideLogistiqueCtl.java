package ma.fstt.aideservice.Controllers;

import ma.fstt.aideservice.Entities.AideLogistique;
import ma.fstt.aideservice.Services.AideLogistiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/aide/aide-logistique")
@RestController
@CrossOrigin
public class AideLogistiqueCtl {

    @Autowired
    AideLogistiqueService aideLogistiqueService;

    @GetMapping
    public ResponseEntity<Map<String, Object>> getall() {
        List<AideLogistique> aides = aideLogistiqueService.getall();
        Map<String, Object> response = new HashMap<>();
        if (!aides.isEmpty()) {
            response.put("data", aides);
        } else {
            response.put("data", null);
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getone(@PathVariable Long id) {
        AideLogistique aide = aideLogistiqueService.getone(id);
        Map<String, Object> response = new HashMap<>();
        if (aide != null) {
            response.put("data", aide);
        } else {
            response.put("data", null);
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> save(@RequestBody AideLogistique aide) {
        AideLogistique savedAide = aideLogistiqueService.save(aide);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "saved");
        response.put("data", savedAide);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Long id) {
        aideLogistiqueService.delete(id);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "deleted");
        return ResponseEntity.ok(response);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Map<String, Object>> update(@PathVariable Long id, @RequestBody AideLogistique aide) {
        aide.setAide_id(id);
        AideLogistique updatedAide = aideLogistiqueService.update(aide);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "updated");
        response.put("data", updatedAide);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/catastrophe/{id}")
    public ResponseEntity<Map<String, Object>> findByCatastrophe_id(@PathVariable Long id) {
        List<AideLogistique> aides = aideLogistiqueService.findByCatastrophe_id(id);
        Map<String, Object> response = new HashMap<>();
        if (!aides.isEmpty()) {
            response.put("data", aides);
        } else {
            response.put("data", null);
        }
        return ResponseEntity.ok(response);
    }
}
