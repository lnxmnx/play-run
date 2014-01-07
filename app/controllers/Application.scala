package controllers

import play.api._
import play.api.mvc._
import org.opencv.core.Mat
import org.opencv.core.CvType

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def getMatrix = Action{
      val m  = Mat.eye(3, 3, CvType.CV_8UC1)
      println("m = " + m.dump())
      Ok("look in conosle")
  }
}