package romilpant.loadingimagefromurlusingpicassoforandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    String url = "https://homepages.cae.wisc.edu/~ece533/images/cat.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image_view);
        loadImageFromUrl(url);
    }

    private void loadImageFromUrl(String url) {
        Picasso.get().load(url).into(imageView);

    }
}
