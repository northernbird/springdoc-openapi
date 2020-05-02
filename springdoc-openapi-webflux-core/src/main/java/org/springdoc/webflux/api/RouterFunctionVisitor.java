package org.springdoc.webflux.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import org.springdoc.core.models.RouterFunctionData;
import reactor.core.publisher.Mono;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;

public class RouterFunctionVisitor implements RouterFunctions.Visitor, RequestPredicates.Visitor {

	private List<RouterFunctionData> routerFunctionDatas = new ArrayList<>();

	private RouterFunctionData routerFunctionData;

	private RequestPredicate routePredicate;

	private HandlerFunction<?> routeHandlerFunction;

	@Override
	public void route(RequestPredicate predicate, HandlerFunction<?> handlerFunction) {
		this.routePredicate = predicate;
		this.routeHandlerFunction = handlerFunction;
		this.routerFunctionData = new RouterFunctionData();
		routerFunctionDatas.add(this.routerFunctionData);
		predicate.accept(this);
	}

	@Override
	public void method(Set<HttpMethod> methods) {
		routerFunctionData.setMethods(methods);
	}

	@Override
	public void path(String pattern) {
		routerFunctionData.setPath(pattern);
	}

	@Override
	public void header(String name, String value) {
		if (HttpHeaders.ACCEPT.equals(name))
			routerFunctionData.setConsumes(value);
		else
			routerFunctionData.setHeaders(name + "=" + value);
	}

	public List<RouterFunctionData> getRouterFunctionDatas() {
		return routerFunctionDatas;
	}


	@Override
	public void startNested(RequestPredicate predicate) {
	}

	@Override
	public void endNested(RequestPredicate predicate) {
	}

	@Override
	public void resources(Function<ServerRequest, Mono<Resource>> lookupFunction) {
	}

	@Override
	public void unknown(RouterFunction<?> routerFunction) {
	}

	@Override
	public void pathExtension(String extension) {
	}


	@Override
	public void queryParam(String name, String value) {
	}

	@Override
	public void startAnd() {
	}

	@Override
	public void and() {
	}

	@Override
	public void endAnd() {
	}

	@Override
	public void startOr() {
	}

	@Override
	public void or() {
	}

	@Override
	public void endOr() {
	}

	@Override
	public void startNegate() {
	}

	@Override
	public void endNegate() {
	}

	@Override
	public void unknown(RequestPredicate predicate) {
	}

}

