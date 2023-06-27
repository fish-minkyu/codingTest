SELECT
    ai.animal_id,
    ai.name
FROM
    animal_ins AS ai
WHERE
    ai.intake_condition <> 'aged'