var exec = require('cordova/exec');

exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'SreeSamplePlugin', 'coolMethod', [arg0]);
};
exports.Addition = function (arg0, success, error) {
    exec(success, error, 'SreeSamplePlugin', 'Addition', [arg0]);
};
