var exec = require('cordova/exec');

module.exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'SreeSamplePlugin', 'coolMethod', [arg0]);
};
module.exports.Addition = function (arg0, success, error) {
    exec(success, error, 'SreeSamplePlugin', 'Addition', [arg0]);
};
