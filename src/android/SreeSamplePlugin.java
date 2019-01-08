package cordova.plugin.sreesampleplugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.content.pm.PackageManager;
import android.Manifest;
import android.os.Build;

import org.apache.cordova.CordovaArgs;
import org.apache.cordova.PermissionHelper;
import org.apache.cordova.PluginResult;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;

import javax.security.auth.callback.Callback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class SreeSamplePlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        if (action.equals("Addition")) {
            String message = args.getString(0);
            this.Addition(message, callbackContext);
            return true;
        }
        if (action.equals("GeoLocation")) {
            String message = args.getString(0);
            this.GeoLocation(message, callbackContext);
            return true;
        }
        if (action.equals("CallCustomFunction")) {
            String message = args.getString(0);
            this.CallCustomFunction(message, callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void Addition(String message, CallbackContext callbackContext) {
            callbackContext.success(" Addition success : " + message);
    }

    private void GeoLocation(String message, CallbackContext callbackContext) {
      // String latlon = "['80.9256368','90.365696']";
      String latlon = "{'Latitude':'90.5693535', 'Longitude':'80.63968574'}";
      callbackContext.success(latlon);
    }

    private void CallCustomFunction(String message, CallbackContext callbackContext) {
        try{
            CustomMethod cm = new CustomMethod();
            String retval = cm.GetAdditionInfo();
            callbackContext.success(retval);
        }     
        catch(Exception exc)    {
            callbackContext.error("exception occoured");
        }
    }


}
