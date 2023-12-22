package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import models.*;
import repos.*;
import java.util.List;

@RestController
@RequestMapping("/newsletters")
public class NewsletterController {

    private final NewsletterRepository newsletterRepository;

    public NewsletterController(NewsletterRepository newsletterRepository) {
        this.newsletterRepository = newsletterRepository;
    }

    // Get all newsletters
    @GetMapping
    public List<Newsletter> getAllNewsletters() {
        return newsletterRepository.findAll();
    }

    // Get newsletter by title
    @GetMapping("/{title}")
    public ResponseEntity<Newsletter> getNewsletterByTitle(@PathVariable String title) {
        return newsletterRepository.findByTitle(title)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Create a new newsletter
    @PostMapping
    public ResponseEntity<Newsletter> createNewsletter(@RequestBody Newsletter newsletter) {
        newsletterRepository.save(newsletter);
        return new ResponseEntity<>(newsletter, HttpStatus.CREATED);
    }

    // Update an existing newsletter
    @PutMapping("/{id}")
    public ResponseEntity<Newsletter> updateNewsletter(@PathVariable String id, @RequestBody Newsletter updatedNewsletter) {
        updatedNewsletter.setId(id);
        newsletterRepository.save(updatedNewsletter);
        return ResponseEntity.ok(updatedNewsletter);
    }

    // Delete a newsletter
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNewsletter(@PathVariable String id) {
        newsletterRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
