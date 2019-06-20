def getPropertyList(String version, boolean snapshots) {
  def repo = (snapshots) ? 'snap' : 'corp'
  def title = (snapshots) ? '-SNAPSHOT' : ''

  
  return[
    "var1" : "serv1, serv2, serv3, serv4, serv5",
    "var2" : "http://someurl.com/" + repo + "/" + version + snapshots"
  ]

}

return this
