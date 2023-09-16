package com.bytesprint.domain.project.model;

/**
 * ProjectStatus
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
public record ProjectStatus(int status, String statusName) {
    public static final ProjectStatus EVALUATION = new ProjectStatus(0, "评估");
    public static final ProjectStatus SIGN = new ProjectStatus(1, "签约");
    public static final ProjectStatus DEVELOP = new ProjectStatus(2, "开发");
    public static final ProjectStatus WAIT_ACCEPTANCE = new ProjectStatus(3, "待验收");
    public static final ProjectStatus ACCEPTANCE = new ProjectStatus(4, "已验收");
    public static final ProjectStatus FINISH = new ProjectStatus(5, "完成");

    public ProjectStatus nextStatus() {
        return switch (this.status) {
            case 0 -> SIGN;
            case 1 -> DEVELOP;
            case 2 -> WAIT_ACCEPTANCE;
            case 3 -> ACCEPTANCE;
            case 4 -> FINISH;
            default -> EVALUATION;
        };
    }

    public ProjectStatus previousStatus() {
        return switch (this.status) {
            case 0 -> EVALUATION;
            case 1 -> EVALUATION;
            case 2 -> SIGN;
            case 3 -> DEVELOP;
            case 4 -> WAIT_ACCEPTANCE;
            case 5 -> ACCEPTANCE;
            default -> EVALUATION;
        };
    }
}
