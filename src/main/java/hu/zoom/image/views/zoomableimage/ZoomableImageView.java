package hu.zoom.image.views.zoomableimage;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import hu.zoom.image.views.MainLayout;

@PageTitle("Zoomable Image ")
@Route(value = "task", layout = MainLayout.class)
public class ZoomableImageView extends Div {

    public ZoomableImageView() {
        addClassName("zoomable-image-view");
        add(new Text("Content placeholder"));
    }

}
