package com.tnpay.userservice.constant;

public class ErrorId {
    public static final String SYSTEM_ERROR = "a40000";
    public static final String USER_NOT_EXISTS = "a40001";
    public static final String ID_IS_REQUIRED = "a40003";
    public static final String USER_EXISTS_WITH_THIS_NAME = "a40004";
    public static final String INVALID_LOGIN_SIZE = "a40008";
    public static final String INVALID_JWT_TOKEN = "a40010";
    public static final String INVALID_PASSWORD_PATTERN = "a40011";
    public static final String INVALID_EMAIL_PATTERN = "a40012";
    public static final String PASSWORD_MISMATCH_WITH_CONFIRMATION_PASSWORD = "a40013";
    public static final String FAILED_TO_SAVE_USER = "a40014";
    public static final String INVALID_USER = "u1001";
    public static final String COMMON_FIELD_ERROR = "field01";
    public static final String REFRESH_TOKEN_WAS_EXPIRED = "a50001";
    public static final String INVALID_USER_NAME_OR_PASSWORD = "a50002";
    public static final String ONLY_TOGGLE_VALUE_ACCEPTED = "common02";
    public static final String MERCHANT_NOT_SAVED = "merchant_10001";
    public static final String DUPLICATE_MERCHANT_EXISTS = "merchant_10002";
    public static final String INVALID_DATA_FORMAT_EXCEPTION = "a5000";
    public static final String MERCHANT_NOT_FOUND = "merchant_10003";
    public static final String MERCHANT_CREDENTIAL_NOT_FOUND = "merchant_10004";
    public static final String USER_NAME_IS_REQUIRED = "u_10001";
    public static final String PASSWORD_AND_CONFIRM_PASSWORD_MISS_MATCHED = "p_10002";
    public static final String PAYMENT_CREDENTIAL_ALREADY_EXISTS_FOR_THIS_PAYMENT_CHANNEL = "c_10004";
    public static final String MERCHANT_CREDENTIAL_NOT_SAVED = "cms_10001";
    public static final String UPSTREAM_MERCHANT_NAME_REQUIRED = "cms_10002";
    public static final String CERTIFICATE_PATH_IS_REQUIRED = "cms_10003";
    public static final String APP_KEY_IS_REQUIRED = "cms_10004";
    public static final String PASSWORD_IS_REQUIRED = "cms_10005";
    public static final String CONFIRM_PASSWORD_IS_REQUIRED = "cms_10006";
    public static final String KEY_STORE_PASSWORD_IS_REQUIRED = "cms_10007";
    public static final String APP_SECRET_IS_REQUIRED = "cms_10008";
    public static final String REFRESH_TOKEN_IS_REQUIRED = "cms_10009";
    public static final String FAILED_TO_PARSE_USER_FROM_AUTHENTICATION = "cms_10010";
    public static final String INVALID_ROLE = "cms_10011";
    public static final String NOT_VALID_USER = "cms_10012";
    public static final String INVALID_OLD_PASSWORD = "cms_10013";
    public static final String THIS_EMAIL_ALREADY_EXISTS_FOR_THIS_USER = "cms_10014";
    public static final String PAYMENT_CHANNEL_NOT_SAVED = "payment_channel_10001";
    public static final String PAYMENT_CHANNEL_NOT_FOUND = "payment_channel_10003";
    public static final String PAYMENT_CHANNEL_ALREADY_EXISTS = "payment_channel_10004";
    public static final String URL_IS_REQUIRED = "cms_20000";
    public static final String MERCHANT_RETURN_URL_ALREADY_EXISTS = "merchant_url_10001";
    public static final String MERCHANT_EMAIL_ALREADY_EXISTS = "merchant_email_10002";
    public static final String MERCHANT_ACCOUNT_ALREADY_EXISTS = "merchant_account_10003";
    public static final String CURRENCY_NOT_FOUND = "currency_10001";
    public static final String CURRENCY_NOT_SAVED = "currency_10002";
    public static final String INVALID_CURRENCY_CODE = "currency_10003";
    public static final String THIS_CURRENCY_NUMBER_ALREADY_EXIST = "currency_10004";
    public static final String THIS_CURRENCY_CODE_ALREADY_EXIST = "currency_10005";
    public static final String INVALID_EXCHANGE_RATE = "exchange_10006";
    public static final String INVALID_MERCHANT_LOGO = "cms_20001";
    public static final String CAN_NOT_DELETE_IMAGE = "cms_20002";
    public static final String PASSWORD_NOT_ALLOWED = "cms_20003";
    public static final String UPSTREAM_MERCHANT_NAME_IS_NOT_ALLOWED = "cms_20004";
    public static final String APP_KEY_IS_NOT_ALLOWED = "cms_20005";
    public static final String PASSWORD_IS_NOT_ALLOWED = "cms_20006";
    public static final String APP_SECRET_IS_NOT_ALLOWED = "cms_20007";
    public static final String CERTIFICATE_PATH_IS_NOT_ALLOWED = "cms_20008";
    public static final String KEY_STORE_PASSWORD_IS_NOT_ALLOWED = "cms_20009";
    public static final String USER_NAME_PASSWORD_IS_NOT_ALLOWED = "cms_20010";
    public static final String ROLE_CAN_NOT_BE_EMPTY = "cms_20011";
    public static final String FAILED_TO_PARSE_MODULE_NAME = "module_11100";
    public static final String FAILED_TO_PARSE_ORDER_STATUS = "cms_20012";
    public static final String START_TIME_MUST_BE_LESS_THAN_OR_EQUAL_TO_END_TIME = "cms_20013";
    public static final String DATE_RANGE_LIMIT_EXCEED = "cms_20014";
    public static final String FILE_PATH_NOT_FOUND = "cms_20015";
    public static final String FAILED_TO_LOAD_JASPER_TEMPLATE = "cms_20016";
    public static final String START_AND_END_TIME_IS_BLANK = "cms_20017";
    public static final String FILE_NAME_CAN_NOT_BE_BLANK = "cms_20018";
    public static final String PAYMENT_ORDER_NOT_FOUND = "cms_20019";
    public static final String INVALID_ACCESS_PERMISSION = "iap_70001";
    public static final String ACTIONS_DATA_NOT_SAVED_DYNAMICALLY = "ads_80001";
    public static final String MODULES_DATA_NOT_SAVED_DYNAMICALLY = "mds_80002";
    public static final String ACTION_RIGHTS_DATA_NOT_SAVED_DYNAMICALLY = "ards_80003";
    public static final String CAN_NOT_REGISTER_SUPER_ADMIN_AND_MERCHANT_USER ="cms_10015";
    public static final String NAGAD_PUBLIC_KEY_IS_NOT_ALLOWED ="cms_20020" ;
    public static final String NAGAD_PUBLIC_KEY_IS_REQUIRED = "cms_20021";
    public static final String MERCHANT_PRIVATE_KEY_IS_NOT_ALLOWED = "cms_20022";
    public static final String MERCHANT_PRIVATE_KEY_IS_REQUIRED = "cms_20023";
    public static final String INVALID_CHANNEL_TYPE = "cms_20024";
    public static final String INVALID_CARD_TYPE = "cms_20025";
    public static final String INVALID_COUNTRY_CODE = "cms_20026";
    public static final String UPAY_MERCHANT_ID_IS_REQUIRED = "cms_20027";
    public static final String UPAY_MERCHANT_ID_IS_NOT_ALLOWED = "cms_20028";
    public static final String UPAY_MERCHANT_KEY_IS_REQUIRED = "cms_20029";
    public static final String UPAY_MERCHANT_KEY_IS_NOT_ALLOWED = "cms_20030";
    public static final String UPAY_MERCHANT_CODE_IS_REQUIRED = "cms_20031";
    public static final String UPAY_MERCHANT_CODE_IS_NOT_ALLOWED = "cms_20032";
    public static final String UPAY_MERCHANT_NAME_IS_REQUIRED = "cms_20033";
    public static final String UPAY_MERCHANT_NAME_IS_NOT_ALLOWED = "cms_20034";
    public static final String INVALID_MOBILE_PATTERN = "cms_20035";
    public static final String FAILED_TO_PARSE_REFUND_STATUS = "cms_20036";
    public static final String PAYMENT_ORDER_IS_NOT_APPROVED = "cms_20037";
    public static final String REFUND_AMOUNT_IS_GREATER_THAN_PAYMENT_ORDER_AMOUNT = "cms_20038";
    public static final String ALREADY_FULL_REFUND_FOR_PAYMENT_ORDER = "cms_20039";
    public static final String MERCHANT_NOT_ALLOWED_TO_REFUND_THIS_PAYMENT = "cms_20040";
    public static final String REFUND_NOT_FOUND = "cms_20041";
    public static final String  PAYMENT_ORDER_ID_IS_REQUIRED = "cms_30000";
    public static final String  ORDER_STATUS_IS_REQUIRED = "cms_30001";
    public static final String INVALID_ACCESS_PERMISSION_FOR_THE_MERCHANT = "cms_20042";
    public static final String REFUND_NOT_SAVED = "cms_20043";
    public static final String REFUND_AMOUNT_SHOULD_BE_GREATER_THAN_ZERO = "cms_20044";
    public static final String  NO_PAYMENT_DETAIL_FOUND = "cms_30002";
    public static final String  NO_REFUND_IS_PERMITTED_FOR_THIS_CHANNEL = "cms_30003";
    public static final String  FAILED_TO_REFUND = "cms_30004";
    public static final String  MERCHANT_CAN_REFUND_ONCE_FOR_A_TRANSACTION_AT_BKASH = "cms_30005";
    public static final String  BRAC_PAYMENT_ID_NOT_FOUND = "brs_40000";
    public static final String  BRAC_REFUND_TRAN_DATA_IS_NULL = "brs_40001";
    public static final String  BRAC_REFUND_TRAN_DATA_DCRYPTION_RESULT_NOT_ZERO_OR_ERROR_TEXT_NOT_NULL = "brs_40002";
    public static final String  BRAC_REFUND_VIEW_GENERATION_ERROR = "brs_40003";
    public static final String PAYMENT_ORDER_ID_NOT_FOUND = "brs_40004";
    public static final String AMOUNT_NOT_FOUND = "brs_40005";
    public static final String FAILED_TO_PARSE_NAGAD_PUBLIC_KEY = "nagad_40001";
    public static final String FAILED_TO_PARSE_MERCHANT_PRIVATE_KEY = "nagad_40002";
    public static final String FAILED_TO_ENCRYPT_DATA = "nagad_40003";
    public static final String DATA_CAN_NOT_BE_EMPTY = "nagad_40004";
    public static final String FAILED_TO_DECRYPT_DATA = "nagad_40005";
    public static final String INVALID_MERCHANT_PRIVATE_KEY = "nagad_40006";
    public static final String FAILED_TO_GENERATE_SIGNATURE = "nagad_40007";
    public static final String MERCHANT_ALLOWED_TO_REFUND_ONCE_NAGAD = "nagad_40008";
    public static final String AMOUNT_SHOULD_NOT_BLANK = "cms_20055";
}