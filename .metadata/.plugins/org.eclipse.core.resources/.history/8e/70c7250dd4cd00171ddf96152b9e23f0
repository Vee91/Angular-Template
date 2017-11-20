define(['app', 'homeService'], function (app) {
    app.controller('homeController',
        ['$location', 'HomeService', function ($location, HomeService) {
            var vm = this;
            vm.welcome = HomeService.welcome();
            

        }]);
    return app;
});