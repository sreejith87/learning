package cordova.plugin.sreesampleplugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

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
      String latlon = "['80.9256368','90.365696']";
      callbackContext.success(latlon);
    }
}
