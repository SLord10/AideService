package ma.fstt.aideservice.Controllers;

import ma.fstt.aideservice.Entities.AideFinancier;
import ma.fstt.aideservice.Services.AideFinancierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/aide/aide-financier")
@RestController
@CrossOrigin
public class AideFinancierCtl {

    @Autowired
    AideFinancierService aideFinancierService;

    @GetMapping
    public ResponseEntity<Map<String, Object>> getall() {
        List<AideFinancier> aides = aideFinancierService.getall();
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
        AideFinancier aide = aideFinancierService.getone(id);
        Map<String, Object> response = new HashMap<>();
        if (aide != null) {
            response.put("data", aide);
        } else {
            response.put("data", null);
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> save(@RequestBody AideFinancier aide) {
        AideFinancier savedAide = aideFinancierService.save(aide);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "saved");
        response.put("data", savedAide);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Long id) {
        aideFinancierService.delete(id);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "deleted");
        return ResponseEntity.ok(response);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Map<String, Object>> update(@PathVariable Long id, @RequestBody AideFinancier aide) {
        aide.setAide_id(id);
        AideFinancier updatedAide = aideFinancierService.update(aide);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "updated");
        response.put("data", updatedAide);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/catastrophe/{id}")
    public ResponseEntity<Map<String, Object>> findByCatastrophe_id(@PathVariable Long id) {
        List<AideFinancier> aides = aideFinancierService.findByCatastrophe_id(id);
        Map<String, Object> response = new HashMap<>();
        if (!aides.isEmpty()) {
            response.put("data", aides);
        } else {
            response.put("data", null);
        }
        return ResponseEntity.ok(response);
    }
}
