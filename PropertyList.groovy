def getPropertyList(String version, boolean snapshots) {
  def repo = (snapshots) ? 'snap' : 'corp'
  def title = (snapshots) ? '-SNAPSHOT' : ''

  
  return[
    "var1" : "a var",
    "var2" : "http://someurl.com/" + repo + "/" + version + snapshots"
  ]

}

return this
