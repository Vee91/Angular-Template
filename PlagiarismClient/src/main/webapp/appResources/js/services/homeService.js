define(['app'], function (app) {
    app.factory('HomeService', function ($http) {
        var factory = {
        		welcome: welcome,
        };

        function welcome() {
            return "This is from service"
        }

        return factory;
    });
});