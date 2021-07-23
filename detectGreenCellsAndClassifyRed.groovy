setPixelSizeMicrons(0.353, 0.353)
createSelectAllObject(true, 0, 0)

setImageType('FLUORESCENCE');
runPlugin('qupath.imagej.detect.cells.WatershedCellDetection', '{"detectionImage": "Green",  "requestedPixelSizeMicrons": 0.5,  "backgroundRadiusMicrons": 8.0,  "medianRadiusMicrons": 2.0,  "sigmaMicrons": 1.5,  "minAreaMicrons": 10.0,  "maxAreaMicrons": 400.0,  "threshold": 8.0,  "watershedPostProcess": true,  "cellExpansionMicrons": 5.0,  "includeNuclei": true,  "smoothBoundaries": true,  "makeMeasurements": true}');
//runObjectClassifier("Red");

setCellIntensityClassifications("Nucleus: Red mean", 232)



