package hu.zoom.image.views.originalimagecomponent;

import java.io.IOException;
import java.io.InputStream;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.StreamResource;

import hu.zoom.image.views.MainLayout;

@PageTitle("Original Image component")
@Route(value = "original", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class SampleView extends VerticalLayout {
	private static final long serialVersionUID = -2986149228380104287L;

	public SampleView() throws IOException {
		addClassName("original-imagecomponent-view");
		try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("file.jpg")) {
			Image imageFromFile = new Image(new StreamResource("originalFile", () -> inputStream), "FROM FILE");
			add(imageFromFile);

			Image imageFromUrl = new Image("https://fortepan.download/_photo/1600/fortepan_85636.jpg", "FROM URL");
			add(imageFromUrl);
		}

		// i need these sample work as zoomable image.
		// https://openseadragon.github.io
		// Here is the main js component what should be implemented as:
		// -- com.vaadin.flow.component.littemplate.LitTemplate OR
		// -- com.vaadin.flow.component.polymertemplate.PolymerTemplate

	}

}
