package in.chandniagarwal.cybersecurityguide.Models;

import android.view.View;

/**
 * Created by jatinkatyal on 03/06/18.
 */

public class HomeCards {

    private int ImageId;
    private String Title;
    private View.OnClickListener listener;

    public HomeCards() {}

    public HomeCards(int imageId, String title, View.OnClickListener listener) {
        ImageId = imageId;
        Title = title;
        this.listener = listener;
    }

    public int getImageId() {
        return ImageId;
    }

    public String getTitle() {
        return Title;
    }

    public View.OnClickListener getListener() {
        return listener;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setListener(View.OnClickListener listener) {
        this.listener = listener;
    }
}
