package streaming

object a3 {

  private val stopWords =
    Set("the", "and", "for", "with", "how", "what", "why", "can", "you", "use", "using")

  def clean(text: String): String = {
    text.toLowerCase
      .replaceAll("[^a-z0-9\\s]", "")
      .split("\\s+")
      .filter(t => t.length >= 3 && !stopWords.contains(t))
      .mkString(" ")
  } }