import play._

class Global  extends GlobalSettings {
	override def beforeStart(app: Application) {
	    super.beforeStart(app);
	    System.load("/home/username/play/lib/libopencv_java247.so")
	}
}