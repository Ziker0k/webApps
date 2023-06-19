$(document).ready(function() {

    $('#contact_form').bootstrapValidator({
        // To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            fullName: {
                validators: {
                    stringLength: {
                        min: 2,
                        message: 'Данные введены неверно.'
                    },
                    notEmpty: {
                        message: 'Пожалуйста, введите ФИО.'
                    }
                }
            },
            email: {
                validators: {
                    notEmpty: {
                        message: 'Пожалуйста введите свой email адрес.'
                    },
                    emailAddress: {
                        message: 'Пожалуйста введите правильный email адрес.'
                    }
                }
            },
            phone: {
                validators: {
                    notEmpty: {
                        message: 'Пожалуйста, введите свой номер телефона.'
                    },
                    regexp:{
                        regexp: '^[\+][\\7]\d{10}$',
                        message: 'Пожалуйста, введите достоверный номер телефона.'
                    }

                }
            },
            addressSend: {
                validators: {
                    stringLength: {
                        min: 8,
                    },
                    notEmpty: {
                        message: 'Пожалуйста, введите адрес отправления'
                    }
                }
            },
            addressDelivery: {
                validators: {
                    stringLength: {
                        min: 8,
                    },
                    notEmpty: {
                        message: 'Пожалуйста, введите адрес доставки'
                    }
                }
            },
            comment: {
                validators: {
                    stringLength: {
                        min: 2,
                        max: 200,
                        message:'Пожалуйста, введите более 2 символов и менее 200'
                    },
                    notEmpty: {
                        message: 'Пожалуйста, введите описание'
                    }
                }
            },
            weight:{
                validators:{
                    notEmpty:{
                        message: 'Пожалуйста, введите вес груза'
                    },
                    regexp:{
                        regexp: '^^\\d+[\\.]\\d{2}$$',
                        message: 'Введите вес в формате: 4.01'
                    }
                }
            }
        }
    })
});