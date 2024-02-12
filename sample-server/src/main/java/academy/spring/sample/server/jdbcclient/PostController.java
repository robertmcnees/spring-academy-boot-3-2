package academy.spring.sample.server.jdbcclient;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class PostController {

	private final PostService postService;

	// Use this constructor for the existing JdbcTemplate
	public PostController(JdbcTemplatePostService postService) {
		this.postService = postService;
	}

	// Use this constructor for the newly created JdbcClient
//	public PostController(JdbcClientPostService postService) {
//		this.postService = postService;
//	}

	@GetMapping("")
	List<Post> findAll() {
		return postService.findAll();
	}

	@GetMapping("/{id}")
	Optional<Post> findById(@PathVariable String id) {
		return postService.findById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	void create(@RequestBody Post post) {
		postService.create(post);
	}

	@PutMapping("/{id}")
	void update(@RequestBody Post post, @PathVariable String id) {
		postService.update(post, id);
	}

	@DeleteMapping("/{id}")
	void delete(@PathVariable String id) {
		postService.delete(id);
	}

}
