package controllers

import play.api.mvc.{Action, Controller}
import model.FizzBuzzCounter
import play.api.libs.json.Json

object FizzBuzz extends Controller {

  def index(number: Int) = Action {
    Ok(views.html.fizzbuzz.render(FizzBuzzCounter.fizzBuzz(number)))
  }

  def indexDefault = Action {
    Ok(views.html.fizzbuzz.render(FizzBuzzCounter.fizzBuzz(15)))
  }

  def json(number: Int) = Action {
    Ok(Json.obj("result" -> Json.toJson(FizzBuzzCounter.fizzBuzz(number))))
  }
}
