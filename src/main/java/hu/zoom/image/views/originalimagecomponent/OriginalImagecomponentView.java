package hu.zoom.image.views.originalimagecomponent;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import hu.zoom.image.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Original Image component")
@Route(value = "original", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class OriginalImagecomponentView extends Div {

    public OriginalImagecomponentView() {
        addClassName("original-imagecomponent-view");
        add(new Text("Content placeholder"));
    }

}
