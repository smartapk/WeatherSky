

package org.jsharkey.sky;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Information to tell users how to insert widgets, and credit to data sources.
 */
public class InfoActivity extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        // When linking text, force to always use default color. This works
        // around a pressed color state bug.
        TextView textView = (TextView)findViewById(R.id.info_credits);
        int defaultColor = textView.getTextColors().getDefaultColor();
        textView.setTextColor(defaultColor);

        ((Button)findViewById(R.id.info_done)).setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.info_done: {
                finish();
                break;
            }
        }
    }
}
