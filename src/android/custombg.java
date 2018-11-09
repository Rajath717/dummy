package cordova.plugin.custombg;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class custombg extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("add")) {
            this.add(args,callbackContext);
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

    private void add(JSONArray args,CallbackContext callback){
        if(args !=null)
        {

            try {

            } catch(Exception Ex){
               
                callback.error("something went wrong"+Ex);

            }



        }
        else{
            callback.error("please dont pass null value");
        }
    }

    private void subtract(JSONArray args,CallbackContext callback){
       

    }
}
