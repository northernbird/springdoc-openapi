/*
 *
 *  *
 *  *  * Copyright 2019-2020 the original author or authors.
 *  *  *
 *  *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  *  * you may not use this file except in compliance with the License.
 *  *  * You may obtain a copy of the License at
 *  *  *
 *  *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *  *
 *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  * See the License for the specific language governing permissions and
 *  *  * limitations under the License.
 *  *
 *
 */

package test.org.springdoc.api.app88;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.stereotype.Component;

@Component
public class PostRepository {

	public Flux<Post> findByAuthor(String author) {
		return Flux.just(new Post("1", "title1", "author1"));
	}

	public Flux<Post> findAll() {
		return Flux.just(new Post("2", "title2", "author2"));
	}

	public Mono<Post> findById(String id) {
		return Mono.just(new Post("3", "title2", "author2"));
	}

	public Mono<Post> save(Post post) {
		return Mono.just(new Post("4", "title2", "author2"));
	}

}
