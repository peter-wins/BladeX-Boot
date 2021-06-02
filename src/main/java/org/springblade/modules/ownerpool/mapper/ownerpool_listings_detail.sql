INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400079254586134535', 0, 'ownerpool', 'ownerpool_listings_detail', 'menu', '/ownerpool/ownerpool_listings_detail', NULL, 1, 1, 0, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400079254586134536', '1400079254586134535', 'ownerpool_listings_detail_add', '新增', 'add', '/ownerpool/ownerpool_listings_detail/add', 'plus', 1, 2, 1, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400079254586134537', '1400079254586134535', 'ownerpool_listings_detail_edit', '修改', 'edit', '/ownerpool/ownerpool_listings_detail/edit', 'form', 2, 2, 2, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400079254586134538', '1400079254586134535', 'ownerpool_listings_detail_delete', '删除', 'delete', '/api/ownerpool/ownerpool_listings_detail/remove', 'delete', 3, 2, 3, 1, NULL, 0);
INSERT INTO `blade_menu`(`id`, `parent_id`, `code`, `name`, `alias`, `path`, `source`, `sort`, `category`, `action`, `is_open`, `remark`, `is_deleted`)
VALUES ('1400079254586134539', '1400079254586134535', 'ownerpool_listings_detail_view', '查看', 'view', '/ownerpool/ownerpool_listings_detail/view', 'file-text', 4, 2, 2, 1, NULL, 0);
