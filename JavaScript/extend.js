function extend(target) {
  if(!arguments[1])
    return;

  for(ii = 0; ii < arguments.length; ii++) {
    source = arguments[ii];

    for(var prop in source) {
      if(!target[prop] && source.hasOwnProperty(prop)) {
        target[prop] = source[prop];
      }
    }
  }
}

function Dog(name) {
  this.name = name;
}

function Cat(name) {
  this.name = name;
}

var walker = {
  walk: function() {
    console.log(this.name + ' is walking.');
  }
}

var runner = {
  run: function() {
    console.log(this.name + ' is running.');
  }
}

extend(Dog.prototype, walker, runner);
extend(Cat.prototype, walker, runner);

var cat = new Cat('Mike');
var dog = new Dog('Shiba');

dog.walk();
cat.run();