package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.fuyumi.flutterstatusbarcolor.flutterstatusbarcolor.FlutterStatusbarcolorPlugin;
import io.flutter.plugins.googlemaps.GoogleMapsPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FlutterStatusbarcolorPlugin.registerWith(registry.registrarFor("com.fuyumi.flutterstatusbarcolor.flutterstatusbarcolor.FlutterStatusbarcolorPlugin"));
    GoogleMapsPlugin.registerWith(registry.registrarFor("io.flutter.plugins.googlemaps.GoogleMapsPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
