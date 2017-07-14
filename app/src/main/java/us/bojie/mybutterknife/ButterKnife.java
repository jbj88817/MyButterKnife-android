package us.bojie.mybutterknife;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;

/**
 * Created by bojiejiang on 7/13/17.
 */

public class ButterKnife {

    public static void bind(Activity activity) {
        try {
            bindView(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void bindView(Activity activity) throws Exception {
        // get bytecode
        Class<? extends Activity> aClass = activity.getClass();

        // get variables in activity
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            // allow force reflect
            declaredField.setAccessible(true);
            // annotation
            BindView annotation = declaredField.getAnnotation(BindView.class);
            if (annotation != null) {
                // get value
                int id = annotation.value();
                // get view
                View view = activity.findViewById(id);
                // set view to activity
                declaredField.set(activity, view);
            }
        }
    }
}
