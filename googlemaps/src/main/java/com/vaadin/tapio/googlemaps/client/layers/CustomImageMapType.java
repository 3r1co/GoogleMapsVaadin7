package com.vaadin.tapio.googlemaps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.maps.gwt.client.ImageMapType;
import com.google.maps.gwt.client.ImageMapTypeOptions;
import com.google.maps.gwt.client.MapType;
import com.google.maps.gwt.client.ImageMapType.TilesLoadedHandler;

public class CustomImageMapType extends MapType {
	 /**
	   * This event is fired when the visible tiles have finished loading.
	   */
	  public interface TilesLoadedHandler  {

	    /**
	     * Override to handle event.
	     */ 
	    void handle();
	  }

	  /**
	   * Constructs an ImageMapType using the provided ImageMapTypeOptions
	   */ 
	  public static native CustomImageMapType create(ImageMapTypeOptions opts)/*-{
	    var _opts;
	    if(@com.google.gwt.core.client.GWT::isScript()()) {
	      _opts = opts;
	    } else {
	      _opts = {};
	      for(k in opts) {
	        if(k != "__gwt_ObjectId") {
	          _opts[k] = opts[k];
	        }
	      }
	    } 
	    return new $wnd.google.maps.ImageMapType(_opts);
	  }-*/;


	  /**
	   * Protected constructor avoids default public constructor.
	   */
	  protected CustomImageMapType() {
	    /* Java constructor is protected, */
	  }

	  /**
	   * Adds the given listener function to the given event name for the
	   * given object instance. Returns an identifier for this listener that
	   * can be used with removeListener().
	   */ 
	  public final native void addTilesLoadedListener(TilesLoadedHandler handler)/*-{
	    var _handler = $entry(function() {
	      handler.@com.google.maps.gwt.client.ImageMapType.TilesLoadedHandler::handle()();

	    }); 
	    $wnd.google.maps.event.addListener(this, "tilesloaded", _handler);
	  }-*/;

	  /**
	   * Like addListener, but the handler removes itself after handling the first event.
	   */ 
	  public final native void addTilesLoadedListenerOnce(TilesLoadedHandler handler)/*-{
	    var _handler = $entry(function() {
	      handler.@com.google.maps.gwt.client.ImageMapType.TilesLoadedHandler::handle()();

	    }); 
	    $wnd.google.maps.event.addListenerOnce(this, "tilesloaded", _handler);
	  }-*/;

	  /**
	   * Removes all listeners for all events for the given instance.
	   */ 
	  public final native void clearInstanceListeners()/*-{
	    $wnd.google.maps.event.clearInstanceListeners(this);
	  }-*/;

	  /**
	   * Removes all listeners for the given event for the given instance.
	   */ 
	  public final native void clearTilesLoadedListeners()/*-{
	    $wnd.google.maps.event.clearListeners(this, "tilesloaded");
	  }-*/;

	  /**
	   * Returns the opacity level (
	   * <code>0</code>
	   * 
	   *  (transparent) to 
	   * <code>1.0</code>
	   * 
	   * ) of the 
	   * <code>ImageMapType</code>
	   * 
	   * tiles.
	   */ 
	  public final native double getOpacity()/*-{
	    return this.getOpacity();

	  }-*/;

	  /**
	   * Sets the opacity level (
	   * <code>0</code>
	   * 
	   *  (transparent) to 
	   * <code>1.0</code>
	   * 
	   * ) of the 
	   * <code>ImageMapType</code>
	   * 
	   * tiles.
	   */ 
	  public final native void setOpacity(double opacity)/*-{
	    this.setOpacity(opacity);

	  }-*/;

	  /**
	   * Triggers the given event. All arguments after eventName are passed as
	   * arguments to the listeners.
	   */ 
	  public final native void triggerTilesLoaded(JavaScriptObject... varargs)/*-{
	    var _varargs =
	        @com.google.maps.gwt.client.ArrayHelper::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(varargs); 
	    $wnd.google.maps.event.trigger(this, "tilesloaded", _varargs);
	  }-*/;

}
