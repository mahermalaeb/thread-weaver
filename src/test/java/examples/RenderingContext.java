/*
 * Copyright 2009 Weaver authors
 *
 * This code is part of the Weaver tutorial and may be freely used.
 */
package examples;


/**
 * Provides a context for rendering a user's avatar. See {@link UserCache}.
 *
 * @author alasdair.mackintosh@gmail.com (Alasdair Mackintosh)
 */
public interface RenderingContext {

  void draw(String avatar);
}
