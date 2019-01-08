var exec = require('cordova/exec');

module.exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'SreeSamplePlugin', 'coolMethod', [arg0]);
};

module.exports.Addition = function (arg0, success, error) {
    exec(success, error, 'SreeSamplePlugin', 'Addition', [arg0]);
};

module.exports.GeoLocation = function (arg0, success, error) {
    exec(success, error, 'SreeSamplePlugin', 'GeoLocation', [arg0]);
};

module.exports.CallCustomFunction = function (arg0, success, error) {
    exec(success, error, 'SreeSamplePlugin', 'CallCustomFunction', [arg0]);
};
