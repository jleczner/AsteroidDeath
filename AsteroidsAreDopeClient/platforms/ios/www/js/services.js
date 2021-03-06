angular.module('app.services', [])

.factory('NeoWsAPI', [function(){
	var asteroids = [{
		"links" : {
			"next" : "https://api.nasa.gov/neo/rest/v1/feed?start_date=2015-09-08&end_date=2015-09-09&detailed=false&api_key=DEMO_KEY",
			"prev" : "https://api.nasa.gov/neo/rest/v1/feed?start_date=2015-09-06&end_date=2015-09-07&detailed=false&api_key=DEMO_KEY",
			"self" : "https://api.nasa.gov/neo/rest/v1/feed?start_date=2015-09-07&end_date=2015-09-08&detailed=false&api_key=DEMO_KEY"
		},
		"element_count" : 20,
		"near_earth_objects" : {
			"2015-09-08" : [ {
				"links" : {
					"self" : "https://api.nasa.gov/neo/rest/v1/neo/3726710?api_key=DEMO_KEY"
				},
				"neo_reference_id" : "3726710",
				"name" : "(2015 RC)",
				"nasa_jpl_url" : "http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=3726710",
				"absolute_magnitude_h" : 24.3,
				"estimated_diameter" : {
					"kilometers" : {
						"estimated_diameter_min" : 0.0366906138,
						"estimated_diameter_max" : 0.0820427065
					},
					"meters" : {
						"estimated_diameter_min" : 36.6906137531,
						"estimated_diameter_max" : 82.0427064882
					},
					"miles" : {
						"estimated_diameter_min" : 0.0227984834,
						"estimated_diameter_max" : 0.0509789586
					},
					"feet" : {
						"estimated_diameter_min" : 120.3760332259,
						"estimated_diameter_max" : 269.1689931548
					}
				},
				"is_potentially_hazardous_asteroid" : false,
				"close_approach_data" : [ {
					"close_approach_date" : "2015-09-08",
					"epoch_date_close_approach" : 1441695600000,
					"relative_velocity" : {
						"kilometers_per_second" : "19.4701053405",
						"kilometers_per_hour" : "70092.3792259649",
						"miles_per_hour" : "43552.6786362669"
					},
					"miss_distance" : {
						"astronomical" : "0.0269024393",
						"lunar" : "10.46504879",
						"kilometers" : "4024547.75",
						"miles" : "2500738"
					},
					"orbiting_body" : "Earth"
				} ]
			}]
		}
	}];

	return {
		all: function() {
			return asteroids;
		},
		get: function(neo_reference_id) {
			for (var i = 0; i < asteroids.length; i++) {
				if (asteroids[i]["neo_reference_id"] === neo_reference_id) {
					return asteroids[i];
				}
			}
			return null;
		}
	};
}])

.service('BlankService', [function(){

}]);