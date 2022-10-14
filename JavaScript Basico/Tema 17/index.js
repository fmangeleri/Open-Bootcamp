let markers, map;

function initMap() {
  const posicion = {
    lat: -25.363,
    lng: 131.044,
  };

  map = new google.maps.Map(document.getElementById("map"), {
    zoom: 4,
    center: posicion,
  });

  markers.push(
    new google.maps.Marker({
      position: {
        lat: -34.635684,
        lng: -58.3648600263424,
      },
      map,
      title: "Bombonera",
    })
  );
  markers.push(
    new google.maps.Marker({
      position: {
        lat: 25.782721,
        lng: -80.140556,
      },
      map,
      title: "Miami",
    })
  );
  markers.push(
    new google.maps.Marker({
      position: {
        lat: 48.860294,
        lng: 2.338629,
      },
      map,
      title: "Louvre",
    })
  );
}