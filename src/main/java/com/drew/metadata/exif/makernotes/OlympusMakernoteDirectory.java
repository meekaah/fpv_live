package com.drew.metadata.exif.makernotes;

import com.drew.lang.SequentialByteArrayReader;
import com.drew.lang.annotations.NotNull;
import com.drew.metadata.Directory;
import dji.sdksharedlib.keycatalog.CameraKeys;
import java.io.IOException;
import java.util.HashMap;

public class OlympusMakernoteDirectory extends Directory {
    public static final HashMap<String, String> OlympusCameraTypes = new HashMap<>();
    public static final int TAG_AF_RESULT = 4152;
    public static final int TAG_APERTURE_VALUE = 4098;
    public static final int TAG_BLACK_LEVEL = 4114;
    public static final int TAG_BLUE_BALANCE = 4120;
    public static final int TAG_BODY_FIRMWARE_VERSION = 260;
    public static final int TAG_BRACKET = 4102;
    public static final int TAG_BRIGHTNESS_VALUE = 4099;
    public static final int TAG_BW_MODE = 515;
    public static final int TAG_CAMERA_ID = 521;
    public static final int TAG_CAMERA_SETTINGS = 8224;
    public static final int TAG_CAMERA_SETTINGS_1 = 1;
    public static final int TAG_CAMERA_SETTINGS_2 = 3;
    public static final int TAG_CAMERA_TYPE = 519;
    public static final int TAG_CCD_SCAN_MODE = 4153;
    public static final int TAG_COLOR_MATRIX_NUMBER = 4121;
    public static final int TAG_COLOR_TEMPERATURE_BG = 4115;
    public static final int TAG_COLOR_TEMPERATURE_RG = 4116;
    public static final int TAG_COLOUR_CONTROL = 4139;
    public static final int TAG_COLOUR_MATRIX = 4113;
    public static final int TAG_COLOUR_MODE = 257;
    public static final int TAG_COMPRESSED_IMAGE_SIZE = 64;
    public static final int TAG_COMPRESSION_RATIO = 4148;
    public static final int TAG_CONTRAST = 4137;
    public static final int TAG_CORING_FILTER = 4141;
    public static final int TAG_DATA_DUMP_1 = 3840;
    public static final int TAG_DATA_DUMP_2 = 3841;
    public static final int TAG_DIGITAL_ZOOM = 516;
    public static final int TAG_EQUIPMENT = 8208;
    public static final int TAG_EXTERNAL_FLASH_AE1 = 4127;
    public static final int TAG_EXTERNAL_FLASH_AE1_0 = 4123;
    public static final int TAG_EXTERNAL_FLASH_AE2 = 4128;
    public static final int TAG_EXTERNAL_FLASH_AE2_0 = 4124;
    public static final int TAG_EXTERNAL_FLASH_BOUNCE = 4134;
    public static final int TAG_EXTERNAL_FLASH_G_VALUE = 4133;
    public static final int TAG_EXTERNAL_FLASH_MODE = 4136;
    public static final int TAG_EXTERNAL_FLASH_ZOOM = 4135;
    public static final int TAG_FIELD_COUNT = 4159;
    public static final int TAG_FIRMWARE = 1029;
    public static final int TAG_FLASH_BIAS = 4131;
    public static final int TAG_FLASH_CHARGE_LEVEL = 4112;
    public static final int TAG_FLASH_DEVICE = 4101;
    public static final int TAG_FLASH_MODE = 4100;
    public static final int TAG_FOCAL_PLANE_DIAGONAL = 517;
    public static final int TAG_FOCUS_DISTANCE = 4108;
    public static final int TAG_FOCUS_INFO = 8272;
    public static final int TAG_FOCUS_MODE = 4107;
    public static final int TAG_FOCUS_RANGE = 4106;
    public static final int TAG_IMAGE_HEIGHT = 524;
    public static final int TAG_IMAGE_PROCESSING = 8256;
    public static final int TAG_IMAGE_QUALITY_1 = 258;
    public static final int TAG_IMAGE_QUALITY_2 = 259;
    public static final int TAG_IMAGE_WIDTH = 523;
    public static final int TAG_INFINITY_LENS_STEP = 4155;
    public static final int TAG_INTERNAL_FLASH_AE1 = 4129;
    public static final int TAG_INTERNAL_FLASH_AE1_0 = 4125;
    public static final int TAG_INTERNAL_FLASH_AE2 = 4130;
    public static final int TAG_INTERNAL_FLASH_AE2_0 = 4126;
    public static final int TAG_INTERNAL_FLASH_TABLE = 4132;
    public static final int TAG_ISO_VALUE = 4097;
    public static final int TAG_JPEG_QUALITY = 513;
    public static final int TAG_LENS_DISTORTION_PARAMETERS = 518;
    public static final int TAG_LENS_TEMPERATURE = 4104;
    public static final int TAG_LIGHT_CONDITION = 4105;
    public static final int TAG_LIGHT_VALUE_CENTER = 4157;
    public static final int TAG_LIGHT_VALUE_PERIPHERY = 4158;
    public static final int TAG_MACRO_FOCUS = 4110;
    public static final int TAG_MACRO_MODE = 514;
    public static final int TAG_MAIN_INFO = 16384;
    public static final int TAG_MAKERNOTE_VERSION = 0;
    public static final int TAG_MINOLTA_THUMBNAIL_LENGTH = 137;
    public static final int TAG_MINOLTA_THUMBNAIL_OFFSET_1 = 129;
    public static final int TAG_MINOLTA_THUMBNAIL_OFFSET_2 = 136;
    public static final int TAG_NEAR_LENS_STEP = 4156;
    public static final int TAG_NOISE_REDUCTION = 4154;
    public static final int TAG_OLYMPUS_IMAGE_HEIGHT = 4143;
    public static final int TAG_OLYMPUS_IMAGE_WIDTH = 4142;
    public static final int TAG_ONE_TOUCH_WB = 770;
    public static final int TAG_ORIGINAL_MANUFACTURER_MODEL = 525;
    public static final int TAG_PICT_INFO = 520;
    public static final int TAG_PREVIEW_IMAGE = 640;
    public static final int TAG_PREVIEW_IMAGE_LENGTH = 4151;
    public static final int TAG_PREVIEW_IMAGE_START = 4150;
    public static final int TAG_PREVIEW_IMAGE_VALID = 4149;
    public static final int TAG_PRE_CAPTURE_FRAMES = 768;
    public static final int TAG_PRINT_IMAGE_MATCHING_INFO = 3584;
    public static final int TAG_RAW_DEVELOPMENT = 8240;
    public static final int TAG_RAW_DEVELOPMENT_2 = 8241;
    public static final int TAG_RAW_INFO = 12288;
    public static final int TAG_RED_BALANCE = 4119;
    public static final int TAG_SCENE_AREA = 4145;
    public static final int TAG_SCENE_DETECT = 4144;
    public static final int TAG_SCENE_DETECT_DATA = 4147;
    public static final int TAG_SCENE_MODE = 1027;
    public static final int TAG_SENSOR_TEMPERATURE = 4103;
    public static final int TAG_SERIAL_NUMBER_1 = 1028;
    public static final int TAG_SERIAL_NUMBER_2 = 4122;
    public static final int TAG_SHARPNESS = 4111;
    public static final int TAG_SHARPNESS_FACTOR = 4138;
    public static final int TAG_SHUTTER_SPEED_VALUE = 4096;
    public static final int TAG_SPECIAL_MODE = 512;
    public static final int TAG_THUMBNAIL_IMAGE = 256;
    public static final int TAG_VALID_BITS = 4140;
    public static final int TAG_WB_MODE = 4117;
    public static final int TAG_WHITE_BALANCE_BIAS = 772;
    public static final int TAG_WHITE_BALANCE_BRACKET = 771;
    public static final int TAG_WHITE_BOARD = 769;
    public static final int TAG_ZOOM = 4109;
    @NotNull
    protected static final HashMap<Integer, String> _tagNameMap = new HashMap<>();

    public static final class CameraSettings {
        private static final int OFFSET = 61440;
        public static final int TAG_APEX_APERTURE_VALUE = 61451;
        public static final int TAG_APEX_BRIGHTNESS_VALUE = 61485;
        public static final int TAG_APEX_FILM_SPEED_VALUE = 61449;
        public static final int TAG_APEX_SHUTTER_SPEED_TIME_VALUE = 61450;
        public static final int TAG_BLACK_AND_WHITE_FILTER = 61483;
        public static final int TAG_BRACKET_STEP = 61455;
        public static final int TAG_CAMERA_MODEL = 61478;
        public static final int TAG_COLOR_FILTER = 61482;
        public static final int TAG_COLOR_MODE = 61481;
        public static final int TAG_CONTRAST = 61473;
        public static final int TAG_DATE = 61462;
        public static final int TAG_DEC_SWITCH_POSITION = 61491;
        public static final int TAG_DIGITAL_ZOOM = 61453;
        public static final int TAG_EXPOSURE_COMPENSATION = 61454;
        public static final int TAG_EXPOSURE_MODE = 61442;
        public static final int TAG_FILE_NUMBER_MEMORY = 61467;
        public static final int TAG_FLASH_COMPENSATION = 61476;
        public static final int TAG_FLASH_FIRED = 61461;
        public static final int TAG_FLASH_MODE = 61443;
        public static final int TAG_FOCAL_LENGTH = 61459;
        public static final int TAG_FOCUS_AREA = 61490;
        public static final int TAG_FOCUS_DISTANCE = 61460;
        public static final int TAG_FOCUS_MODE = 61489;
        public static final int TAG_FOLDER_NAME = 61480;
        public static final int TAG_IMAGE_QUALITY = 61446;
        public static final int TAG_IMAGE_SIZE = 61445;
        public static final int TAG_INTERNAL_FLASH = 61484;
        public static final int TAG_INTERVAL_LENGTH = 61457;
        public static final int TAG_INTERVAL_MODE = 61479;
        public static final int TAG_INTERVAL_NUMBER = 61458;
        public static final int TAG_ISO_SETTING = 61477;
        public static final int TAG_LAST_FILE_NUMBER = 61468;
        public static final int TAG_MACRO_MODE = 61452;
        public static final int TAG_MAX_APERTURE_AT_FOCAL_LENGTH = 61464;
        public static final int TAG_METERING_MODE = 61448;
        public static final int TAG_SATURATION = 61472;
        public static final int TAG_SHARPNESS = 61474;
        public static final int TAG_SHOOTING_MODE = 61447;
        public static final int TAG_SPOT_FOCUS_POINT_X_COORDINATE = 61486;
        public static final int TAG_SPOT_FOCUS_POINT_Y_COORDINATE = 61487;
        public static final int TAG_SUBJECT_PROGRAM = 61475;
        public static final int TAG_TIME = 61463;
        public static final int TAG_WHITE_BALANCE = 61444;
        public static final int TAG_WHITE_BALANCE_BLUE = 61471;
        public static final int TAG_WHITE_BALANCE_GREEN = 61470;
        public static final int TAG_WHITE_BALANCE_RED = 61469;
        public static final int TAG_WIDE_FOCUS_ZONE = 61488;
    }

    static {
        _tagNameMap.put(0, "Makernote Version");
        _tagNameMap.put(1, "Camera Settings");
        _tagNameMap.put(3, "Camera Settings");
        _tagNameMap.put(64, "Compressed Image Size");
        _tagNameMap.put(129, "Thumbnail Offset");
        _tagNameMap.put(136, "Thumbnail Offset");
        _tagNameMap.put(137, "Thumbnail Length");
        _tagNameMap.put(256, "Thumbnail Image");
        _tagNameMap.put(257, "Colour Mode");
        _tagNameMap.put(258, "Image Quality");
        _tagNameMap.put(259, "Image Quality");
        _tagNameMap.put(260, "Body Firmware Version");
        _tagNameMap.put(512, "Special Mode");
        _tagNameMap.put(513, "JPEG Quality");
        _tagNameMap.put(514, "Macro");
        _tagNameMap.put(515, "BW Mode");
        _tagNameMap.put(516, "Digital Zoom");
        _tagNameMap.put(517, "Focal Plane Diagonal");
        _tagNameMap.put(518, "Lens Distortion Parameters");
        _tagNameMap.put(519, "Camera Type");
        _tagNameMap.put(520, "Pict Info");
        _tagNameMap.put(521, "Camera Id");
        _tagNameMap.put(523, "Image Width");
        _tagNameMap.put(524, "Image Height");
        _tagNameMap.put(Integer.valueOf((int) TAG_ORIGINAL_MANUFACTURER_MODEL), "Original Manufacturer Model");
        _tagNameMap.put(Integer.valueOf((int) TAG_PREVIEW_IMAGE), "Preview Image");
        _tagNameMap.put(768, "Pre Capture Frames");
        _tagNameMap.put(769, "White Board");
        _tagNameMap.put(770, "One Touch WB");
        _tagNameMap.put(771, "White Balance Bracket");
        _tagNameMap.put(772, "White Balance Bias");
        _tagNameMap.put(1027, "Scene Mode");
        _tagNameMap.put(1028, "Serial Number");
        _tagNameMap.put(1029, "Firmware");
        _tagNameMap.put(3584, "Print Image Matching (PIM) Info");
        _tagNameMap.put(3840, "Data Dump");
        _tagNameMap.put(Integer.valueOf((int) TAG_DATA_DUMP_2), "Data Dump 2");
        _tagNameMap.put(4096, "Shutter Speed Value");
        _tagNameMap.put(4097, "ISO Value");
        _tagNameMap.put(4098, "Aperture Value");
        _tagNameMap.put(4099, "Brightness Value");
        _tagNameMap.put(4100, "Flash Mode");
        _tagNameMap.put(4101, "Flash Device");
        _tagNameMap.put(4102, "Bracket");
        _tagNameMap.put(Integer.valueOf((int) TAG_SENSOR_TEMPERATURE), "Sensor Temperature");
        _tagNameMap.put(Integer.valueOf((int) TAG_LENS_TEMPERATURE), "Lens Temperature");
        _tagNameMap.put(Integer.valueOf((int) TAG_LIGHT_CONDITION), "Light Condition");
        _tagNameMap.put(4106, "Focus Range");
        _tagNameMap.put(4107, "Focus Mode");
        _tagNameMap.put(Integer.valueOf((int) TAG_FOCUS_DISTANCE), "Focus Distance");
        _tagNameMap.put(Integer.valueOf((int) TAG_ZOOM), "Zoom");
        _tagNameMap.put(4110, "Macro Focus");
        _tagNameMap.put(Integer.valueOf((int) TAG_SHARPNESS), CameraKeys.SHARPNESS);
        _tagNameMap.put(4112, "Flash Charge Level");
        _tagNameMap.put(4113, "Colour Matrix");
        _tagNameMap.put(4114, "Black Level");
        _tagNameMap.put(4115, "Color Temperature BG");
        _tagNameMap.put(Integer.valueOf((int) TAG_COLOR_TEMPERATURE_RG), "Color Temperature RG");
        _tagNameMap.put(Integer.valueOf((int) TAG_WB_MODE), "White Balance Mode");
        _tagNameMap.put(Integer.valueOf((int) TAG_RED_BALANCE), "Red Balance");
        _tagNameMap.put(Integer.valueOf((int) TAG_BLUE_BALANCE), "Blue Balance");
        _tagNameMap.put(Integer.valueOf((int) TAG_COLOR_MATRIX_NUMBER), "Color Matrix Number");
        _tagNameMap.put(Integer.valueOf((int) TAG_SERIAL_NUMBER_2), "Serial Number");
        _tagNameMap.put(Integer.valueOf((int) TAG_EXTERNAL_FLASH_AE1_0), "External Flash AE1 0");
        _tagNameMap.put(4124, "External Flash AE2 0");
        _tagNameMap.put(Integer.valueOf((int) TAG_INTERNAL_FLASH_AE1_0), "Internal Flash AE1 0");
        _tagNameMap.put(Integer.valueOf((int) TAG_INTERNAL_FLASH_AE2_0), "Internal Flash AE2 0");
        _tagNameMap.put(Integer.valueOf((int) TAG_EXTERNAL_FLASH_AE1), "External Flash AE1");
        _tagNameMap.put(4128, "External Flash AE2");
        _tagNameMap.put(4129, "Internal Flash AE1");
        _tagNameMap.put(Integer.valueOf((int) TAG_INTERNAL_FLASH_AE2), "Internal Flash AE2");
        _tagNameMap.put(4131, "Flash Bias");
        _tagNameMap.put(Integer.valueOf((int) TAG_INTERNAL_FLASH_TABLE), "Internal Flash Table");
        _tagNameMap.put(Integer.valueOf((int) TAG_EXTERNAL_FLASH_G_VALUE), "External Flash G Value");
        _tagNameMap.put(Integer.valueOf((int) TAG_EXTERNAL_FLASH_BOUNCE), "External Flash Bounce");
        _tagNameMap.put(Integer.valueOf((int) TAG_EXTERNAL_FLASH_ZOOM), "External Flash Zoom");
        _tagNameMap.put(Integer.valueOf((int) TAG_EXTERNAL_FLASH_MODE), "External Flash Mode");
        _tagNameMap.put(Integer.valueOf((int) TAG_CONTRAST), CameraKeys.CONTRAST);
        _tagNameMap.put(Integer.valueOf((int) TAG_SHARPNESS_FACTOR), "Sharpness Factor");
        _tagNameMap.put(Integer.valueOf((int) TAG_COLOUR_CONTROL), "Colour Control");
        _tagNameMap.put(Integer.valueOf((int) TAG_VALID_BITS), "Valid Bits");
        _tagNameMap.put(Integer.valueOf((int) TAG_CORING_FILTER), "Coring Filter");
        _tagNameMap.put(Integer.valueOf((int) TAG_OLYMPUS_IMAGE_WIDTH), "Olympus Image Width");
        _tagNameMap.put(Integer.valueOf((int) TAG_OLYMPUS_IMAGE_HEIGHT), "Olympus Image Height");
        _tagNameMap.put(4144, "Scene Detect");
        _tagNameMap.put(4145, "Scene Area");
        _tagNameMap.put(4147, "Scene Detect Data");
        _tagNameMap.put(4148, "Compression Ratio");
        _tagNameMap.put(Integer.valueOf((int) TAG_PREVIEW_IMAGE_VALID), "Preview Image Valid");
        _tagNameMap.put(Integer.valueOf((int) TAG_PREVIEW_IMAGE_START), "Preview Image Start");
        _tagNameMap.put(Integer.valueOf((int) TAG_PREVIEW_IMAGE_LENGTH), "Preview Image Length");
        _tagNameMap.put(Integer.valueOf((int) TAG_AF_RESULT), "AF Result");
        _tagNameMap.put(Integer.valueOf((int) TAG_CCD_SCAN_MODE), "CCD Scan Mode");
        _tagNameMap.put(Integer.valueOf((int) TAG_NOISE_REDUCTION), "Noise Reduction");
        _tagNameMap.put(Integer.valueOf((int) TAG_INFINITY_LENS_STEP), "Infinity Lens Step");
        _tagNameMap.put(Integer.valueOf((int) TAG_NEAR_LENS_STEP), "Near Lens Step");
        _tagNameMap.put(Integer.valueOf((int) TAG_LIGHT_VALUE_CENTER), "Light Value Center");
        _tagNameMap.put(Integer.valueOf((int) TAG_LIGHT_VALUE_PERIPHERY), "Light Value Periphery");
        _tagNameMap.put(Integer.valueOf((int) TAG_FIELD_COUNT), "Field Count");
        _tagNameMap.put(8208, "Equipment");
        _tagNameMap.put(8224, "Camera Settings");
        _tagNameMap.put(Integer.valueOf((int) TAG_RAW_DEVELOPMENT), "Raw Development");
        _tagNameMap.put(Integer.valueOf((int) TAG_RAW_DEVELOPMENT_2), "Raw Development 2");
        _tagNameMap.put(Integer.valueOf((int) TAG_IMAGE_PROCESSING), "Image Processing");
        _tagNameMap.put(Integer.valueOf((int) TAG_FOCUS_INFO), "Focus Info");
        _tagNameMap.put(12288, "Raw Info");
        _tagNameMap.put(16384, "Main Info");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_EXPOSURE_MODE), "Exposure Mode");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_FLASH_MODE), "Flash Mode");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_WHITE_BALANCE), "White Balance");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_IMAGE_SIZE), "Image Size");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_IMAGE_QUALITY), "Image Quality");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_SHOOTING_MODE), "Shooting Mode");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_METERING_MODE), "Metering Mode");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_APEX_FILM_SPEED_VALUE), "Apex Film Speed Value");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_APEX_SHUTTER_SPEED_TIME_VALUE), "Apex Shutter Speed Time Value");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_APEX_APERTURE_VALUE), "Apex Aperture Value");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_MACRO_MODE), "Macro Mode");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_DIGITAL_ZOOM), "Digital Zoom");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_EXPOSURE_COMPENSATION), "Exposure Compensation");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_BRACKET_STEP), "Bracket Step");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_INTERVAL_LENGTH), "Interval Length");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_INTERVAL_NUMBER), "Interval Number");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_FOCAL_LENGTH), "Focal Length");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_FOCUS_DISTANCE), "Focus Distance");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_FLASH_FIRED), "Flash Fired");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_DATE), "Date");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_TIME), "Time");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_MAX_APERTURE_AT_FOCAL_LENGTH), "Max Aperture at Focal Length");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_FILE_NUMBER_MEMORY), "File Number Memory");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_LAST_FILE_NUMBER), "Last File Number");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_WHITE_BALANCE_RED), "White Balance Red");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_WHITE_BALANCE_GREEN), "White Balance Green");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_WHITE_BALANCE_BLUE), "White Balance Blue");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_SATURATION), CameraKeys.SATURATION);
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_CONTRAST), CameraKeys.CONTRAST);
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_SHARPNESS), CameraKeys.SHARPNESS);
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_SUBJECT_PROGRAM), "Subject Program");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_FLASH_COMPENSATION), "Flash Compensation");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_ISO_SETTING), "ISO Setting");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_CAMERA_MODEL), "Camera Model");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_INTERVAL_MODE), "Interval Mode");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_FOLDER_NAME), "Folder Name");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_COLOR_MODE), "Color Mode");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_COLOR_FILTER), "Color Filter");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_BLACK_AND_WHITE_FILTER), "Black and White Filter");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_INTERNAL_FLASH), "Internal Flash");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_APEX_BRIGHTNESS_VALUE), "Apex Brightness Value");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_SPOT_FOCUS_POINT_X_COORDINATE), "Spot Focus Point X Coordinate");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_SPOT_FOCUS_POINT_Y_COORDINATE), "Spot Focus Point Y Coordinate");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_WIDE_FOCUS_ZONE), "Wide Focus Zone");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_FOCUS_MODE), "Focus Mode");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_FOCUS_AREA), "Focus Area");
        _tagNameMap.put(Integer.valueOf((int) CameraSettings.TAG_DEC_SWITCH_POSITION), "DEC Switch Position");
        OlympusCameraTypes.put("D4028", "X-2,C-50Z");
        OlympusCameraTypes.put("D4029", "E-20,E-20N,E-20P");
        OlympusCameraTypes.put("D4034", "C720UZ");
        OlympusCameraTypes.put("D4040", "E-1");
        OlympusCameraTypes.put("D4041", "E-300");
        OlympusCameraTypes.put("D4083", "C2Z,D520Z,C220Z");
        OlympusCameraTypes.put("D4106", "u20D,S400D,u400D");
        OlympusCameraTypes.put("D4120", "X-1");
        OlympusCameraTypes.put("D4122", "u10D,S300D,u300D");
        OlympusCameraTypes.put("D4125", "AZ-1");
        OlympusCameraTypes.put("D4141", "C150,D390");
        OlympusCameraTypes.put("D4193", "C-5000Z");
        OlympusCameraTypes.put("D4194", "X-3,C-60Z");
        OlympusCameraTypes.put("D4199", "u30D,S410D,u410D");
        OlympusCameraTypes.put("D4205", "X450,D535Z,C370Z");
        OlympusCameraTypes.put("D4210", "C160,D395");
        OlympusCameraTypes.put("D4211", "C725UZ");
        OlympusCameraTypes.put("D4213", "FerrariMODEL2003");
        OlympusCameraTypes.put("D4216", "u15D");
        OlympusCameraTypes.put("D4217", "u25D");
        OlympusCameraTypes.put("D4220", "u-miniD,Stylus V");
        OlympusCameraTypes.put("D4221", "u40D,S500,uD500");
        OlympusCameraTypes.put("D4231", "FerrariMODEL2004");
        OlympusCameraTypes.put("D4240", "X500,D590Z,C470Z");
        OlympusCameraTypes.put("D4244", "uD800,S800");
        OlympusCameraTypes.put("D4256", "u720SW,S720SW");
        OlympusCameraTypes.put("D4261", "X600,D630,FE5500");
        OlympusCameraTypes.put("D4262", "uD600,S600");
        OlympusCameraTypes.put("D4301", "u810/S810");
        OlympusCameraTypes.put("D4302", "u710,S710");
        OlympusCameraTypes.put("D4303", "u700,S700");
        OlympusCameraTypes.put("D4304", "FE100,X710");
        OlympusCameraTypes.put("D4305", "FE110,X705");
        OlympusCameraTypes.put("D4310", "FE-130,X-720");
        OlympusCameraTypes.put("D4311", "FE-140,X-725");
        OlympusCameraTypes.put("D4312", "FE150,X730");
        OlympusCameraTypes.put("D4313", "FE160,X735");
        OlympusCameraTypes.put("D4314", "u740,S740");
        OlympusCameraTypes.put("D4315", "u750,S750");
        OlympusCameraTypes.put("D4316", "u730/S730");
        OlympusCameraTypes.put("D4317", "FE115,X715");
        OlympusCameraTypes.put("D4321", "SP550UZ");
        OlympusCameraTypes.put("D4322", "SP510UZ");
        OlympusCameraTypes.put("D4324", "FE170,X760");
        OlympusCameraTypes.put("D4326", "FE200");
        OlympusCameraTypes.put("D4327", "FE190/X750");
        OlympusCameraTypes.put("D4328", "u760,S760");
        OlympusCameraTypes.put("D4330", "FE180/X745");
        OlympusCameraTypes.put("D4331", "u1000/S1000");
        OlympusCameraTypes.put("D4332", "u770SW,S770SW");
        OlympusCameraTypes.put("D4333", "FE240/X795");
        OlympusCameraTypes.put("D4334", "FE210,X775");
        OlympusCameraTypes.put("D4336", "FE230/X790");
        OlympusCameraTypes.put("D4337", "FE220,X785");
        OlympusCameraTypes.put("D4338", "u725SW,S725SW");
        OlympusCameraTypes.put("D4339", "FE250/X800");
        OlympusCameraTypes.put("D4341", "u780,S780");
        OlympusCameraTypes.put("D4343", "u790SW,S790SW");
        OlympusCameraTypes.put("D4344", "u1020,S1020");
        OlympusCameraTypes.put("D4346", "FE15,X10");
        OlympusCameraTypes.put("D4348", "FE280,X820,C520");
        OlympusCameraTypes.put("D4349", "FE300,X830");
        OlympusCameraTypes.put("D4350", "u820,S820");
        OlympusCameraTypes.put("D4351", "u1200,S1200");
        OlympusCameraTypes.put("D4352", "FE270,X815,C510");
        OlympusCameraTypes.put("D4353", "u795SW,S795SW");
        OlympusCameraTypes.put("D4354", "u1030SW,S1030SW");
        OlympusCameraTypes.put("D4355", "SP560UZ");
        OlympusCameraTypes.put("D4356", "u1010,S1010");
        OlympusCameraTypes.put("D4357", "u830,S830");
        OlympusCameraTypes.put("D4359", "u840,S840");
        OlympusCameraTypes.put("D4360", "FE350WIDE,X865");
        OlympusCameraTypes.put("D4361", "u850SW,S850SW");
        OlympusCameraTypes.put("D4362", "FE340,X855,C560");
        OlympusCameraTypes.put("D4363", "FE320,X835,C540");
        OlympusCameraTypes.put("D4364", "SP570UZ");
        OlympusCameraTypes.put("D4366", "FE330,X845,C550");
        OlympusCameraTypes.put("D4368", "FE310,X840,C530");
        OlympusCameraTypes.put("D4370", "u1050SW,S1050SW");
        OlympusCameraTypes.put("D4371", "u1060,S1060");
        OlympusCameraTypes.put("D4372", "FE370,X880,C575");
        OlympusCameraTypes.put("D4374", "SP565UZ");
        OlympusCameraTypes.put("D4377", "u1040,S1040");
        OlympusCameraTypes.put("D4378", "FE360,X875,C570");
        OlympusCameraTypes.put("D4379", "FE20,X15,C25");
        OlympusCameraTypes.put("D4380", "uT6000,ST6000");
        OlympusCameraTypes.put("D4381", "uT8000,ST8000");
        OlympusCameraTypes.put("D4382", "u9000,S9000");
        OlympusCameraTypes.put("D4384", "SP590UZ");
        OlympusCameraTypes.put("D4385", "FE3010,X895");
        OlympusCameraTypes.put("D4386", "FE3000,X890");
        OlympusCameraTypes.put("D4387", "FE35,X30");
        OlympusCameraTypes.put("D4388", "u550WP,S550WP");
        OlympusCameraTypes.put("D4390", "FE5000,X905");
        OlympusCameraTypes.put("D4391", "u5000");
        OlympusCameraTypes.put("D4392", "u7000,S7000");
        OlympusCameraTypes.put("D4396", "FE5010,X915");
        OlympusCameraTypes.put("D4397", "FE25,X20");
        OlympusCameraTypes.put("D4398", "FE45,X40");
        OlympusCameraTypes.put("D4401", "XZ-1");
        OlympusCameraTypes.put("D4402", "uT6010,ST6010");
        OlympusCameraTypes.put("D4406", "u7010,S7010 / u7020,S7020");
        OlympusCameraTypes.put("D4407", "FE4010,X930");
        OlympusCameraTypes.put("D4408", "X560WP");
        OlympusCameraTypes.put("D4409", "FE26,X21");
        OlympusCameraTypes.put("D4410", "FE4000,X920,X925");
        OlympusCameraTypes.put("D4411", "FE46,X41,X42");
        OlympusCameraTypes.put("D4412", "FE5020,X935");
        OlympusCameraTypes.put("D4413", "uTough-3000");
        OlympusCameraTypes.put("D4414", "StylusTough-6020");
        OlympusCameraTypes.put("D4415", "StylusTough-8010");
        OlympusCameraTypes.put("D4417", "u5010,S5010");
        OlympusCameraTypes.put("D4418", "u7040,S7040");
        OlympusCameraTypes.put("D4419", "u9010,S9010");
        OlympusCameraTypes.put("D4423", "FE4040");
        OlympusCameraTypes.put("D4424", "FE47,X43");
        OlympusCameraTypes.put("D4426", "FE4030,X950");
        OlympusCameraTypes.put("D4428", "FE5030,X965,X960");
        OlympusCameraTypes.put("D4430", "u7030,S7030");
        OlympusCameraTypes.put("D4432", "SP600UZ");
        OlympusCameraTypes.put("D4434", "SP800UZ");
        OlympusCameraTypes.put("D4439", "FE4020,X940");
        OlympusCameraTypes.put("D4442", "FE5035");
        OlympusCameraTypes.put("D4448", "FE4050,X970");
        OlympusCameraTypes.put("D4450", "FE5050,X985");
        OlympusCameraTypes.put("D4454", "u-7050");
        OlympusCameraTypes.put("D4464", "T10,X27");
        OlympusCameraTypes.put("D4470", "FE5040,X980");
        OlympusCameraTypes.put("D4472", "TG-310");
        OlympusCameraTypes.put("D4474", "TG-610");
        OlympusCameraTypes.put("D4476", "TG-810");
        OlympusCameraTypes.put("D4478", "VG145,VG140,D715");
        OlympusCameraTypes.put("D4479", "VG130,D710");
        OlympusCameraTypes.put("D4480", "VG120,D705");
        OlympusCameraTypes.put("D4482", "VR310,D720");
        OlympusCameraTypes.put("D4484", "VR320,D725");
        OlympusCameraTypes.put("D4486", "VR330,D730");
        OlympusCameraTypes.put("D4488", "VG110,D700");
        OlympusCameraTypes.put("D4490", "SP-610UZ");
        OlympusCameraTypes.put("D4492", "SZ-10");
        OlympusCameraTypes.put("D4494", "SZ-20");
        OlympusCameraTypes.put("D4496", "SZ-30MR");
        OlympusCameraTypes.put("D4498", "SP-810UZ");
        OlympusCameraTypes.put("D4500", "SZ-11");
        OlympusCameraTypes.put("D4504", "TG-615");
        OlympusCameraTypes.put("D4508", "TG-620");
        OlympusCameraTypes.put("D4510", "TG-820");
        OlympusCameraTypes.put("D4512", "TG-1");
        OlympusCameraTypes.put("D4516", "SH-21");
        OlympusCameraTypes.put("D4519", "SZ-14");
        OlympusCameraTypes.put("D4520", "SZ-31MR");
        OlympusCameraTypes.put("D4521", "SH-25MR");
        OlympusCameraTypes.put("D4523", "SP-720UZ");
        OlympusCameraTypes.put("D4529", "VG170");
        OlympusCameraTypes.put("D4531", "XZ-2");
        OlympusCameraTypes.put("D4535", "SP-620UZ");
        OlympusCameraTypes.put("D4536", "TG-320");
        OlympusCameraTypes.put("D4537", "VR340,D750");
        OlympusCameraTypes.put("D4538", "VG160,X990,D745");
        OlympusCameraTypes.put("D4541", "SZ-12");
        OlympusCameraTypes.put("D4545", "VH410");
        OlympusCameraTypes.put("D4546", "XZ-10");
        OlympusCameraTypes.put("D4547", "TG-2");
        OlympusCameraTypes.put("D4548", "TG-830");
        OlympusCameraTypes.put("D4549", "TG-630");
        OlympusCameraTypes.put("D4550", "SH-50");
        OlympusCameraTypes.put("D4553", "SZ-16,DZ-105");
        OlympusCameraTypes.put("D4562", "SP-820UZ");
        OlympusCameraTypes.put("D4566", "SZ-15");
        OlympusCameraTypes.put("D4572", "STYLUS1");
        OlympusCameraTypes.put("D4574", "TG-3");
        OlympusCameraTypes.put("D4575", "TG-850");
        OlympusCameraTypes.put("D4579", "SP-100EE");
        OlympusCameraTypes.put("D4580", "SH-60");
        OlympusCameraTypes.put("D4581", "SH-1");
        OlympusCameraTypes.put("D4582", "TG-835");
        OlympusCameraTypes.put("D4585", "SH-2 / SH-3");
        OlympusCameraTypes.put("D4586", "TG-4");
        OlympusCameraTypes.put("D4587", "TG-860");
        OlympusCameraTypes.put("D4591", "TG-870");
        OlympusCameraTypes.put("D4809", "C2500L");
        OlympusCameraTypes.put("D4842", "E-10");
        OlympusCameraTypes.put("D4856", "C-1");
        OlympusCameraTypes.put("D4857", "C-1Z,D-150Z");
        OlympusCameraTypes.put("DCHC", "D500L");
        OlympusCameraTypes.put("DCHT", "D600L / D620L");
        OlympusCameraTypes.put("K0055", "AIR-A01");
        OlympusCameraTypes.put("S0003", "E-330");
        OlympusCameraTypes.put("S0004", "E-500");
        OlympusCameraTypes.put("S0009", "E-400");
        OlympusCameraTypes.put("S0010", "E-510");
        OlympusCameraTypes.put("S0011", "E-3");
        OlympusCameraTypes.put("S0013", "E-410");
        OlympusCameraTypes.put("S0016", "E-420");
        OlympusCameraTypes.put("S0017", "E-30");
        OlympusCameraTypes.put("S0018", "E-520");
        OlympusCameraTypes.put("S0019", "E-P1");
        OlympusCameraTypes.put("S0023", "E-620");
        OlympusCameraTypes.put("S0026", "E-P2");
        OlympusCameraTypes.put("S0027", "E-PL1");
        OlympusCameraTypes.put("S0029", "E-450");
        OlympusCameraTypes.put("S0030", "E-600");
        OlympusCameraTypes.put("S0032", "E-P3");
        OlympusCameraTypes.put("S0033", "E-5");
        OlympusCameraTypes.put("S0034", "E-PL2");
        OlympusCameraTypes.put("S0036", "E-M5");
        OlympusCameraTypes.put("S0038", "E-PL3");
        OlympusCameraTypes.put("S0039", "E-PM1");
        OlympusCameraTypes.put("S0040", "E-PL1s");
        OlympusCameraTypes.put("S0042", "E-PL5");
        OlympusCameraTypes.put("S0043", "E-PM2");
        OlympusCameraTypes.put("S0044", "E-P5");
        OlympusCameraTypes.put("S0045", "E-PL6");
        OlympusCameraTypes.put("S0046", "E-PL7");
        OlympusCameraTypes.put("S0047", "E-M1");
        OlympusCameraTypes.put("S0051", "E-M10");
        OlympusCameraTypes.put("S0052", "E-M5MarkII");
        OlympusCameraTypes.put("S0059", "E-M10MarkII");
        OlympusCameraTypes.put("S0061", "PEN-F");
        OlympusCameraTypes.put("S0065", "E-PL8");
        OlympusCameraTypes.put("S0067", "E-M1MarkII");
        OlympusCameraTypes.put("SR45", "D220");
        OlympusCameraTypes.put("SR55", "D320L");
        OlympusCameraTypes.put("SR83", "D340L");
        OlympusCameraTypes.put("SR85", "C830L,D340R");
        OlympusCameraTypes.put("SR852", "C860L,D360L");
        OlympusCameraTypes.put("SR872", "C900Z,D400Z");
        OlympusCameraTypes.put("SR874", "C960Z,D460Z");
        OlympusCameraTypes.put("SR951", "C2000Z");
        OlympusCameraTypes.put("SR952", "C21");
        OlympusCameraTypes.put("SR953", "C21T.commu");
        OlympusCameraTypes.put("SR954", "C2020Z");
        OlympusCameraTypes.put("SR955", "C990Z,D490Z");
        OlympusCameraTypes.put("SR956", "C211Z");
        OlympusCameraTypes.put("SR959", "C990ZS,D490Z");
        OlympusCameraTypes.put("SR95A", "C2100UZ");
        OlympusCameraTypes.put("SR971", "C100,D370");
        OlympusCameraTypes.put("SR973", "C2,D230");
        OlympusCameraTypes.put("SX151", "E100RS");
        OlympusCameraTypes.put("SX351", "C3000Z / C3030Z");
        OlympusCameraTypes.put("SX354", "C3040Z");
        OlympusCameraTypes.put("SX355", "C2040Z");
        OlympusCameraTypes.put("SX357", "C700UZ");
        OlympusCameraTypes.put("SX358", "C200Z,D510Z");
        OlympusCameraTypes.put("SX374", "C3100Z,C3020Z");
        OlympusCameraTypes.put("SX552", "C4040Z");
        OlympusCameraTypes.put("SX553", "C40Z,D40Z");
        OlympusCameraTypes.put("SX556", "C730UZ");
        OlympusCameraTypes.put("SX558", "C5050Z");
        OlympusCameraTypes.put("SX571", "C120,D380");
        OlympusCameraTypes.put("SX574", "C300Z,D550Z");
        OlympusCameraTypes.put("SX575", "C4100Z,C4000Z");
        OlympusCameraTypes.put("SX751", "X200,D560Z,C350Z");
        OlympusCameraTypes.put("SX752", "X300,D565Z,C450Z");
        OlympusCameraTypes.put("SX753", "C750UZ");
        OlympusCameraTypes.put("SX754", "C740UZ");
        OlympusCameraTypes.put("SX755", "C755UZ");
        OlympusCameraTypes.put("SX756", "C5060WZ");
        OlympusCameraTypes.put("SX757", "C8080WZ");
        OlympusCameraTypes.put("SX758", "X350,D575Z,C360Z");
        OlympusCameraTypes.put("SX759", "X400,D580Z,C460Z");
        OlympusCameraTypes.put("SX75A", "AZ-2ZOOM");
        OlympusCameraTypes.put("SX75B", "D595Z,C500Z");
        OlympusCameraTypes.put("SX75C", "X550,D545Z,C480Z");
        OlympusCameraTypes.put("SX75D", "IR-300");
        OlympusCameraTypes.put("SX75F", "C55Z,C5500Z");
        OlympusCameraTypes.put("SX75G", "C170,D425");
        OlympusCameraTypes.put("SX75J", "C180,D435");
        OlympusCameraTypes.put("SX771", "C760UZ");
        OlympusCameraTypes.put("SX772", "C770UZ");
        OlympusCameraTypes.put("SX773", "C745UZ");
        OlympusCameraTypes.put("SX774", "X250,D560Z,C350Z");
        OlympusCameraTypes.put("SX775", "X100,D540Z,C310Z");
        OlympusCameraTypes.put("SX776", "C460ZdelSol");
        OlympusCameraTypes.put("SX777", "C765UZ");
        OlympusCameraTypes.put("SX77A", "D555Z,C315Z");
        OlympusCameraTypes.put("SX851", "C7070WZ");
        OlympusCameraTypes.put("SX852", "C70Z,C7000Z");
        OlympusCameraTypes.put("SX853", "SP500UZ");
        OlympusCameraTypes.put("SX854", "SP310");
        OlympusCameraTypes.put("SX855", "SP350");
        OlympusCameraTypes.put("SX873", "SP320");
        OlympusCameraTypes.put("SX875", "FE180/X745");
        OlympusCameraTypes.put("SX876", "FE190/X750");
    }

    public OlympusMakernoteDirectory() {
        setDescriptor(new OlympusMakernoteDescriptor(this));
    }

    @NotNull
    public String getName() {
        return "Olympus Makernote";
    }

    public void setByteArray(int tagType, @NotNull byte[] bytes) {
        if (tagType == 1 || tagType == 3) {
            processCameraSettings(bytes);
        } else {
            super.setByteArray(tagType, bytes);
        }
    }

    private void processCameraSettings(byte[] bytes) {
        SequentialByteArrayReader reader = new SequentialByteArrayReader(bytes);
        reader.setMotorolaByteOrder(true);
        int count = bytes.length / 4;
        int i = 0;
        while (i < count) {
            try {
                setInt(61440 + i, reader.getInt32());
                i++;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
    }

    public boolean isIntervalMode() {
        Long value = getLongObject(CameraSettings.TAG_SHOOTING_MODE);
        return value != null && value.longValue() == 5;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}