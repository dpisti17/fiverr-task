# Fiverr TASK

 I need these sample work as zoomable image like here:
	- https://openseadragon.github.io
	- the webjar: https://github.com/webjars/openseadragon

The javaScript component should be implemented as:
	com.vaadin.flow.component.littemplate.LitTemplate 
  OR
	com.vaadin.flow.component.polymertemplate.PolymerTemplate

	public SampleView() throws IOException {
		addClassName("original-imagecomponent-view");
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("file.jpg");
		Image imageFromFile = new Image(new StreamResource("originalFile", () -> inputStream), "FROM FILE");
		add(imageFromFile);

		Image imageFromUrl = new Image("https://fortepan.download/_photo/1600/fortepan_85636.jpg", "FROM URL");
		add(imageFromUrl);
   }
  
  I want the result looks somehow like this:
		 ZoomableImage zoomableFile = new ZoomableImage(new StreamResource("originalFile", () -> inputStream), "FROM FILE");
		add(zoomableFile);

		 ZoomableImage zoomableUrl =  new ZoomableImage("https://fortepan.download/_photo/1600/fortepan_85636.jpg", "FROM URL");
		 add(zoomableUrl);
		
