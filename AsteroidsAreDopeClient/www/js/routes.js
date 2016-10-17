angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider
    
  

      .state('side-menu.home', {
    url: '/home',
    views: {
      'side-menu': {
        templateUrl: 'templates/home.html',
        controller: 'homeCtrl'
      }
    }
  })

  .state('side-menu.timeline', {
    url: '/timeline',
    views: {
      'side-menu': {
        templateUrl: 'templates/timeline.html',
        controller: 'AsteroidsListCtrl'
      }
    }
  })

  .state('side-menu.visualize', {
    url: '/visualize',
    views: {
      'side-menu': {
        templateUrl: 'templates/visualize.html',
        controller: 'visualizeCtrl'
      }
    }
  })

  .state('side-menu', {
    url: '/side-menu',
    templateUrl: 'templates/side-menu.html',
    controller: 'side-menuCtrl'
  })

$urlRouterProvider.otherwise('/side-menu/home')

  

});