package blocks.maintenance.controllers;

import blocks.maintenance.model.Association;
import blocks.maintenance.model.User;
import blocks.maintenance.repository.AssociationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("association")
@CrossOrigin
public class AssociationController {
    @Autowired
    AssociationRepository associationRepository;

    @PostMapping()
    public ResponseEntity<Association> createAssociation(@RequestBody Association association) {
        return ResponseEntity.ok().body(
               associationRepository.save(association)
        );
    }
}
