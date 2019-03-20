// Generated code from Butter Knife. Do not modify!
package com.mobiles.shadov.googlemapsapp.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.beardedhen.androidbootstrap.BootstrapButton;
import com.mobiles.shadov.googlemapsapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MapsActivity_ViewBinding implements Unbinder {
  private MapsActivity target;

  @UiThread
  public MapsActivity_ViewBinding(MapsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MapsActivity_ViewBinding(MapsActivity target, View source) {
    this.target = target;

    target.spinner = Utils.findRequiredViewAsType(source, R.id.spinner, "field 'spinner'", Spinner.class);
    target.textView = Utils.findRequiredViewAsType(source, R.id.textViewKM, "field 'textView'", TextView.class);
    target.checkBox = Utils.findRequiredViewAsType(source, R.id.checkBox, "field 'checkBox'", CheckBox.class);
    target.buttonRemoveMarker = Utils.findRequiredViewAsType(source, R.id.deleteButton, "field 'buttonRemoveMarker'", BootstrapButton.class);
    target.buttonConnectCities = Utils.findRequiredViewAsType(source, R.id.addButton, "field 'buttonConnectCities'", BootstrapButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MapsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.spinner = null;
    target.textView = null;
    target.checkBox = null;
    target.buttonRemoveMarker = null;
    target.buttonConnectCities = null;
  }
}
