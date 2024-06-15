package com.example.demoD;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@RestController
@RequestMapping
public class Controller {
@Autowired
private CheckinRepository p;
@GetMapping()
public Page<Checkin> a1(@RequestParam int page,
		@RequestParam int size){
	return p.findAll(PageRequest.of(page, size));
}
@GetMapping("/sorting1")
public List<Checkin> a2(@RequestParam String sortBy){
	Sort sort =Sort.by(sortBy);
	return p.findAll(sort);
}
@GetMapping()
public Checkin  a3(@PathVariable int id) {
	return p.findById(id).orElse(null);
}
@PostMapping()
public Checkin a4(@RequestBody Checkin checkin  ) {
	return p.save(checkin);
}
@PutMapping("/categories/{id}")
public Checkin a5(@PathVariable int id,@RequestBody Checkin  checkin) {
	return p.findById(id).map(e->{e.setName(checkin.getName());
	return p.save(e);
})
			.orElse(null);
}
@DeleteMapping()
public void a6(@PathVariable int id) {
	p.deleteById(id);
}
@Autowired
private GuestRepository q;
@GetMapping()
public Page<Guest> b1(@RequestParam int page,
		@RequestParam int size){
	return q.findAll(PageRequest.of(page, size));
}
@GetMapping("/sorting2")
public List<Guest> b2(@RequestParam String sortBy){
	Sort sort =Sort.by(sortBy);
	return q.findAll(sort);
}
@GetMapping()
public Guest  b3(@PathVariable int id) {
	return q.findById(id).orElse(null);
}
@PostMapping()
public Guest b4(@RequestBody Guest guest  ) {
	return q.save(guest);
}
@PutMapping("/categories/{id}")
public Guest b5(@PathVariable int id,@RequestBody Guest  Guest) {
	return q.findById(id).map(e->{e.setName(Guest.getName());
	return q.save(e);
})
			.orElse(null);
}
@DeleteMapping()
public void b6(@PathVariable int id) {
	q.deleteById(id);
}
}