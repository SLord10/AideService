package ma.fstt.aideservice.Controllers;

import ma.fstt.aideservice.Entities.Aide;
import ma.fstt.aideservice.Services.AideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/aide")
@RestController
@CrossOrigin
public class AideCtl {

    @Autowired
    AideService aideService;

    @PostMapping
    public ResponseEntity<Map<String, Object>> add(@RequestBody Aide aide) {
        aideService.save(aide);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "saved");
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Long id) {
        aideService.delete(id);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "deleted");
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<Map<String, Object>> getall() {
        List<Aide> aides = aideService.getall();
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
        Aide aide = aideService.getone(id);
        Map<String, Object> response = new HashMap<>();
        if (aide != null) {
            response.put("data", aide);
        } else {
            response.put("data", null);
        }
        return ResponseEntity.ok(response);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Map<String, Object>> update(@PathVariable Long id, @RequestBody Aide aide) {
        aide.setAide_id(id);
        aideService.update(aide);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "updated");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/catastrophe/{id}")
    public ResponseEntity<Map<String, Object>> findByCatastrophe_id(@PathVariable Long id) {
        List<Aide> aides = aideService.findByCatastrophe_id(id);
        Map<String, Object> response = new HashMap<>();
        if (!aides.isEmpty()) {
            response.put("data", aides);
        } else {
            response.put("data", null);
        }
        return ResponseEntity.ok(response);
    }
}
