
//create an extruded polygon
CSG polygon = Extrude.points(new Vector3d(0, 0, 40),// This is the  extrusion depth
                new Vector3d(0,0),// All values after this are the points in the polygon
                new Vector3d(135,0),// Bottom right corner
                new Vector3d(100,70),// upper right corner
                new Vector3d(20,40)// upper left corner
        );
return polygon