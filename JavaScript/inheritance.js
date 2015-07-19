function Interview(name, language) {
  this.name = name,
  this.language = language
}

Interview.prototype.practicing = function() {
  console.log("I'm practicing " + this.name + " with " + this.language);
}

function Javascript(chapter) {
  Interview.call(this, "algorithm", "javascript");
  this.chapter = chapter;
}

Javascript.prototype = Object.create(Interview.prototype);
Javascript.prototype.learning = function() {
  console.log("I'm learning chapter " + this.chapter + " for " + this.name + " in " + this.language + " language.");
}

var interview = new Interview("sorting", "java");
var javascript = new Javascript("inheritance");

interview.practicing();
javascript.learning();