package ma.fstt.aideservice.Controllers;

import ma.fstt.aideservice.Entities.Volontariat;
import ma.fstt.aideservice.Services.VolontariatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/aide/volontariat")
@RestController
@CrossOrigin
public class VolontariatCtl {

    @Autowired
    VolontariatService volontariatService;

    @GetMapping
    public ResponseEntity<Map<String, Object>> getall() {
        List<Volontariat> volontariats = volontariatService.getall();
        Map<String, Object> response = new HashMap<>();
        if (!volontariats.isEmpty()) {
            response.put("data", volontariats);
        } else {
            response.put("data", null);
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getone(@PathVariable Long id) {
        Volontariat volontariat = volontariatService.getone(id);
        Map<String, Object> response = new HashMap<>();
        if (volontariat != null) {
            response.put("data", volontariat);
        } else {
            response.put("data", null);
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> save(@RequestBody Volontariat volontariat) {
        Volontariat savedVolontariat = volontariatService.save(volontariat);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "saved");
        response.put("data", savedVolontariat);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Long id) {
        volontariatService.delete(id);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "deleted");
        return ResponseEntity.ok(response);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Map<String, Object>> update(@PathVariable Long id, @RequestBody Volontariat volontariat) {
        volontariat.setAide_id(id);
        Volontariat updatedVolontariat = volontariatService.update(volontariat);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "updated");
        response.put("data", updatedVolontariat);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/catastrophe/{id}")
    public ResponseEntity<Map<String, Object>> findByCatastrophe_id(@PathVariable Long id) {
        List<Volontariat> volontariats = volontariatService.findByCatastrophe_id(id);
        Map<String, Object> response = new HashMap<>();
        if (!volontariats.isEmpty()) {
            response.put("data", volontariats);
        } else {
            response.put("data", null);
        }
        return ResponseEntity.ok(response);
    }
}
