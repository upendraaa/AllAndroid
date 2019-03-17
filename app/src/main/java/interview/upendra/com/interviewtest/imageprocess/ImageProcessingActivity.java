package interview.upendra.com.interviewtest.imageprocess;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import interview.upendra.com.interviewtest.R;

public class ImageProcessingActivity extends AppCompatActivity {

//Place holder required for Image to download smoothly
//    val requestOption = RequestOptions()
//            .placeholder(R.drawable.placeholder).centerCrop()
    //Load the image
//Glide.with(this).load(fullImageUrl)
//                .apply(requestOption)
//                .into(my_image_view)


//    Glide.with(this).load(fullImageUrl)
//       .transition(DrawableTransitionOptions.withCrossFade())
//            .apply(requestOption)
//       .into(my_image_view)


    //Add thumbnail image with low resolution to avoid the shaggy upload , it will show the processing smoothly
//    Glide.with(this).load(fullImageUrl)
//       .transition(DrawableTransitionOptions.withCrossFade())
//            .thumbnail(Glide.with(this)
//            .load(fastLoadUrl)
//            .apply(requestOption))
//            .apply(requestOption)
//       .into(my_image_view)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_processing);
    }
}
