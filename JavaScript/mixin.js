function mixins(target, source, methods) {
  for(var ii = 2; ii < arguments.length; ii++) {
    var prop = arguments[ii];

    target[prop] = source[prop].bind(source); // bind it to the source object so that this refers to the source object.
  }
}